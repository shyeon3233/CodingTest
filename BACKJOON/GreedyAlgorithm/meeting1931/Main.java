package meeting1931;

import java.util.Scanner;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		
		n = scanner.nextInt();
		scanner.nextLine();
		
		List<Time> meetingTime = new ArrayList<Time>();
	
		for(int i=0; i < n; i++) {
			meetingTime.add(new Time(scanner.nextLine()));
		}
		
		Collections.sort(meetingTime, new CompareTime()); // 회의 종료 시간 오름차순으로 정렬	
		
		int count = 1;
		Time mt = meetingTime.get(0); // 맨 첫 번째 회의 정보
		
		for(int i=1; i < n; i++) {
			// 현재 회의 종료 시간이 다름 회의의 시작 시간과 같거나 앞이라면 count 증가 및 현재 회의를 다음 회의로 변경
			if(mt.getEndTime() <= meetingTime.get(i).getStartTime()) {
				count++;
				mt  = meetingTime.get(i);
			}
		}
		
		System.out.println(count);
		
		scanner.close();
	
		
	}
}

class CompareTime implements Comparator<Time>{

	@Override
	public int compare(Time t1, Time t2) {
		// TODO Auto-generated method stub
		if(t1.getEndTime() > t2.getEndTime()) return 1;
		if(t1.getEndTime() < t2.getEndTime()) return -1;

		// 회의 종료 시간이 동일한 경우 회의 시작 시간으로 정렬
		if(t1.getStartTime() > t2.getStartTime()) return 1;
		if(t1.getStartTime() < t2.getStartTime()) return -1;
		return 0;
	}
	
}
class Time	{
	private int start;
	private int end;
	private int time;
	
	public Time(String meetingTime) {
		this.start = Integer.parseInt(meetingTime.split(" ")[0]);
		this.end = Integer.parseInt(meetingTime.split(" ")[1]); 
		this.time = end - start;
	}
	
	public int getTime() {
		return time;
	}
	
	public int getStartTime() {
		return start;
	}
	
	public int getEndTime() {
		return end;
	}
	
	@Override
	public String toString() {
		return String.format("start : %d, end : %d, time : %d%n", start, end, time);
	}
	
};
