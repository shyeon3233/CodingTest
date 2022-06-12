package coin11047;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, k;
		int quotient = 0;	// 동전의 갯수를 저장하기 위한 변수
		
		n = scanner.nextInt();
		k = scanner.nextInt();
		
		int[] coins = new int[n];
		
		// 동전을 배열에 저
		for(int i=0; i < coins.length; i++)
			coins[i] = scanner.nextInt();
		
		
		// 배열에 저장된 값을 뒤에서부터 가져와 k보다 작거나 같은지 확
		for(int i=coins.length; i > 0; i--) {
			if(coins[i-1] <= k) {
				// 작거나 같은 경우 동전으로 k를 나눔
				quotient += k / coins[i-1];
				// 나눈 후 나머지 값을 저
				k = k % coins[i-1];
			}
			// 나머지 값이 0이라면 더 이상 비교할 필요가 없으므로 break
			if(k == 0) break; 
			
		}
		// 동전의 갯수를 출
		System.out.printf("%d", quotient);
		scanner.close();
		
	}
}
