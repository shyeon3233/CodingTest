package atm11399;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sum = 0;
		
		for(int i=0; i < n; i++) {
			sum += (arr[i] * (n - i));
		}
		System.out.println(sum);
		
		sc.close();
	}
}
