package solution;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectEuler010 {
	static ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     int casesNumber = scanner.nextInt();
	     int maxNumber = 0;
	     int[] cases = new int[casesNumber];
	     for(int i = 0; i < casesNumber; i++) {
	    	 cases[i] = scanner.nextInt();
	    	 maxNumber = Math.max(maxNumber, cases[i]);
	     }
	     scanner.close();
	     findPrimes(maxNumber);
	     printSolutions(cases);
	}

	private static void findPrimes(int maxNumber) {
		primeNumbers.add(2);
		for(int i = 3; i <= maxNumber; i++) 
			if(isPrime(i))
				primeNumbers.add(i);
	}

	static boolean isPrime(long number) {
		boolean answer = true;
		for(int i=3; i*i<=number; i+=2)
			if(number%i==0) {
				answer= false;
                break;
			}
		return answer;
	}
	
	private static void printSolutions(int[] cases) {
		int casesNumber = cases.length;
		for(int i = 0; i < casesNumber; i++)
			printSolution(cases[i]);
	}
	
	private static void printSolution(int number) {
		long solution = 0;
		for(int prime : primeNumbers) {
			if(prime > number)
				break;
			solution += prime;
		}
		 System.out.println(solution);
	}
}
