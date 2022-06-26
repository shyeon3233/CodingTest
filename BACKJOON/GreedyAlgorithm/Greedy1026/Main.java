package treasure1026;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Treasure treasure = new Treasure();
		treasure.inputData();
		treasure.sortData();
		treasure.calculation();
		treasure.printResult();
		
	}
	
}

class Treasure {
	int n;
	List<Integer> arrA;
	List<Integer> arrB;
	int result;
	
	// 생성자로 초기화
	public Treasure(){
		arrA = new ArrayList<Integer>();
		arrB = new ArrayList<Integer>() {
			
		};
		int n = 0;
		int result = 0;
	}
	
	// n, arrA, arrB 입력
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		for(int i=0; i < n; i++)
			arrA.add(scanner.nextInt());
		
		for(int i=0; i < n; i++)
			arrB.add(scanner.nextInt());
		scanner.close();
	}
	
	// arrA, arrB 정렬
	public void sortData() {
		arrA.sort(null);
		arrB.sort(Collections.reverseOrder());
//		System.out.println(arrA.toString());
//		System.out.println(arrB.toString());
	}
	
	// 연산
	public void calculation() {
		for(int i=0; i < n; i++) {
			result += arrA.get(i) * arrB.get(i);
		}
	}
	
	// 출력
	public void printResult() {
		System.out.println(result);
	}
}
