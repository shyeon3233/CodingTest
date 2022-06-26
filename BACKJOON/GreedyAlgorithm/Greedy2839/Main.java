package sugar2839;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int MAX = 5000;
		final int MIN = 3;
		int n = 0;
		int bigBag = 5, smallBag = 3;
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		
		if(n < MIN || n > MAX) {		// 입력값이 3 <= n <= 5000인지 확인한다. 
			System.exit(0);
		}
		
		int smallBagMax = (MAX / smallBag) + 1;	// 5000을 3으로 나누었을 때의 값
		int bigBagMax = (MAX / bigBag) + 1;		// 5000을 5로 나누었을 때의 값
		
		for(int i=0; i < smallBagMax + 1; i++) {	// i가 1667이 될 때까지 반복
			for(int j=0; j < bigBagMax + 1; j++) {	// j가 1001이 될 때까지 반복
				// 작은 가방의 갯수가 i일때 큰 가방 얼만큼 사용해서 n을 만들 수 있는지 확
				if((bigBag * j) + (smallBag * i) == n) {
					System.out.println(i + j);
					scanner.close();
					System.exit(0);
				}
			}
		}
		
		System.out.println("-1");
		
		
		scanner.close();
		
		
	}
}
