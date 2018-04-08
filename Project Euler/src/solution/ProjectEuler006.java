package solution;

import java.util.Scanner;

public class ProjectEuler006 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     int casesNumber = scanner.nextInt();
	     for(int i = 0; i < casesNumber; i++){
	    	 long answer = sumSquareDifference(scanner.nextInt());
	    	 System.out.println(answer);
	     }
	     scanner.close();
	}
	
	static long sumSquareDifference(int number) {
		long sumOfSquares = sumOfSquares(number);
		long squareOfSum = squareOfSum(number);
		long difference = squareOfSum - sumOfSquares;
		return difference;
	}
	
	static long sumOfSquares(int number) {
		long sumOfSquares = number;
        sumOfSquares *= number + 1;
        sumOfSquares *= 2 * number + 1;
        sumOfSquares /= 6;
		return sumOfSquares;
	}
	
	static long squareOfSum(int number) {
		long sumOfNumbers = number;
        sumOfNumbers *= number + 1;
        sumOfNumbers /= 2;
		long squareOfSum = sumOfNumbers * sumOfNumbers;
		return squareOfSum;
	}
}
