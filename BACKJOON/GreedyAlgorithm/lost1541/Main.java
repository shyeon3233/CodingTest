package lost1541;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FindMinNumber find = new FindMinNumber(scanner.nextLine());
		
	}
	
}

class FindMinNumber{
	String formula;
	List<Integer> numbers = new ArrayList<Integer>();
	List<String> operators = new ArrayList<String>();
	int result;
	
	public FindMinNumber(String formula) {
		String[] strNumbers = formula.split("[+-]+");
		int len = strNumbers.length;
				
		for(int i=0; i < len; i++) numbers.add(Integer.parseInt(strNumbers[i]));
		
		String[] strOperators = formula.split("[0-9]+");
		len = strOperators.length;
		System.out.println(Arrays.toString(strOperators));
		for(int i=0; i < len; i++) operators.add(strOperators[i]);
		for(int i=0; i < len; i++) System.out.println(numbers.get(i));
		for(int i=0; i < len; i++) operators.add(strOperators[i]);
		
		for(int i=0; i < len; i++) System.out.println(operators.get(i));
	}
	
}