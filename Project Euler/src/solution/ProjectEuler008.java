package solution;

import java.util.Scanner;

public class ProjectEuler008 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     int casesNumber = scanner.nextInt();
	     for(int i = 0; i < casesNumber; i++){
	    	 largestProduct(scanner);
	     }
	     scanner.close();
	}

	private static void largestProduct(Scanner scanner) {
		int digitsNumber = scanner.nextInt();
		int productArea = scanner.nextInt();
		String number = scanner.next();
        char[] consecutiveDigits = number.toCharArray();
        findLargestProduct(consecutiveDigits, productArea);        
	}

	private static void findLargestProduct(char[] digits, int area) {
		int length = digits.length - area;
		int solution = 0;
		for(int i = 0; i < length; i++) {
			int product = findProduct(i, digits, area);
			solution = Math.max(solution, product);
		}
		System.out.println(solution);	
	}

	private static int findProduct(int possition, char[] digits, int area) {
		int product = 1;
		for(int i = 0; i < area; i++) {
			int multiplier = Character.getNumericValue(digits[possition + i]);
			product *= multiplier;
		}
		return product;
	}
}
