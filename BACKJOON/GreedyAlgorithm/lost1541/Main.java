package lost1541;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws IOException {
		
		// 입력 값을 담기 위한 변수 생
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<String> arr = new ArrayList<String>();
		
		// 입력 값 담기
		inputValues(reader.readLine(), arr);
		
		// 계산해서 나오는 가장 작은 값 찾
		int result = findMinValue(arr);
		System.out.println(result);
	}	
	
	public static void inputValues(String cal, List<String> arr) {
		for(String oper : cal.split("-")) { // '-' 를 기준으로 값을 나눈다.
			arr.add(oper);
		}
	}
	
	public static int findMinValue(List<String> arr) {
		int result = 0;
		List<Integer> tmps = new ArrayList<Integer>();	// '-'를 기준으로 나눠진 값을 담는 용
		
		for(String n : arr) {
			if(n.split("\\+").length > 1) {	// '+'를 기준으로 나눴을 때 1보다 큰 경우 
				int tmp = 0;
				for(String num : n.split("\\+")) {
					tmp += Integer.parseInt(num);
				}
				tmps.add(tmp);
			}else {
				tmps.add(Integer.parseInt(n));
			}
		}
		
		for(int i=0; i < tmps.size(); i++) {
			if(i == 0) { // 첫 번째 값은 그냥 입력 
				result = tmps.get(i);
			}else {	/// 두 번째 부터 빼준다.
				result -= tmps.get(i);
			}
		}
		
		return result;
	}
}
