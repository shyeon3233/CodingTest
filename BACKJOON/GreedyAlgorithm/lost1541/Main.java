package lost1541;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		FindMinNumber fmn = new FindMinNumber(scanner.nextLine());
		
	}
	
	
}

class FindMinNumber{
	List<Integer> numArr;
	List<String> operArr;
	
	public FindMinNumber(String cal) {
		System.out.println(Arrays.toString(cal.split("[+-]")));
	}
	
	
}
