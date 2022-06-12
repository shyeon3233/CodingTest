package meeting1931;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		
		n = scanner.nextInt();

		Map<String, Integer> meetingTime = new HashMap<>();
		
		for(int i=0; i < n; i++) {
			String time = scanner.nextLine();
			int num = Integer.parseInt(time.split(" ")[1]) - Integer.parseInt(time.split(" ")[0]);
			meetingTime.put(scanner.nextLine(), num);
		}
		
		
		scanner.close();
	
	
	}
}
