package change5585;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
 * 문제
 * 타로는 자주 JOI잡화점에서 물건을 산다. 
 * JOI잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고, 
 * 언제나 거스름돈 개수가 가장 적게 잔돈을 준다. 
 * 타로가 JOI잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때, 
 * 받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.
 * 
 * 입력
 * 입력은 한줄로 이루어져있고, 타로가 지불할 돈(1 이상 1000미만의 정수) 1개가 쓰여져있다.
 * 
 * 출력
 * 제출할 출력 파일은 1행으로만 되어 있다. 잔돈에 포함된 매수를 출력하시오.
 * */
public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Integer[] temp = new Integer[] { 500, 100, 50, 10, 5, 1 };
		List<Integer> change = new ArrayList<Integer>(Arrays.asList(temp));
		int money = 1000;
		String price = "";
	
		try {
			price = reader.readLine();
			
		}catch(IOException e) {
			System.out.println("잘못된 입력입니다.");
		}
		
		int result = coinCounter(money, Integer.parseInt(price), change);
		
		System.out.println(result);
	}
	private static int coinCounter(int money, int price, List<Integer> change) {
		int result = money - price; 
		int coins = 0;
		for(int n : change) {
			coins += result / n; 			
			result = result % n; 
			if(result == 0) { break; }
		}
		
		return coins;
	}
}
