package solution;

import java.util.Scanner;

public class ProjectEuler012 {
	static long[] triagleNumbers;
	static int maxDivisorsNumber = 0;
	private static int divisorsFound = 1;
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     int casesNumber = scanner.nextInt();
	     int[] cases = new int[casesNumber];
	     for(int i = 0; i < casesNumber; i++) {
	    	 cases[i] = scanner.nextInt();
	    	 maxDivisorsNumber = Math.max(maxDivisorsNumber,
	    			 cases[i]);
	     }
	     scanner.close();
	     findDivisorsNumber();
	     printSolutions(cases);
	}

	private static void findDivisorsNumber() {
		 int previousProductDivisorsNumber = 1;
		 int triagleCount = 2;
		 iniciateTriagleNumbers();
		 while(divisorsFound <= maxDivisorsNumber) {
			 int currentProductDivisorsNumber =
					 divisorsNumber(triagleCount);
			 int productNumber = previousProductDivisorsNumber *
					 currentProductDivisorsNumber;
			 addTriagleNumbers(productNumber, triagleCount);
	         previousProductDivisorsNumber = 
	        		 currentProductDivisorsNumber;
	         triagleCount++;
		 }		
	}
	
	private static void iniciateTriagleNumbers() {
		triagleNumbers = new long[maxDivisorsNumber + 1];
		triagleNumbers[0] = 1;
	}
	
	private static int divisorsNumber(int number) {
		int i;
		int divisors = 0;
		number = checkEven(number);
		for(i = 1; i * i < number; i++)
			if(number % i == 0) 
				divisors += 2;
		if(i * i == number)
			divisors ++;
		return divisors;
	}

	private static int checkEven(int number) {
		if(number % 2 == 0) number /=2;
		return number;
	}
	

	private static void addTriagleNumbers(int productNumber,
			int triagleCount) {
		while(productNumber > divisorsFound
       		 && divisorsFound<=maxDivisorsNumber){
				triagleNumbers[divisorsFound]=
						(triagleCount - 1) * triagleCount / 2;
				divisorsFound++;
        }
	}

	private static void printSolutions(int[] cases) {
		int casesNumber = cases.length;
		for(int i = 0; i < casesNumber; i++){
			int dividorsToFound = cases[i];
			long minNumberWithDividors = 
					triagleNumbers[dividorsToFound];
            System.out.println(minNumberWithDividors);
        }		
	}
}
