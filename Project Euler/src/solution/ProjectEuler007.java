package solution;

import java.util.Scanner;

public class ProjectEuler007 {
	static long[] primes;
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     int casesNumber = scanner.nextInt();
	     int[] cases = new int[casesNumber];
	     for(int i = 0; i < casesNumber; i++){
	    	 cases[i] = scanner.nextInt();
	     }
	     scanner.close();
	     printPrimes(cases);
	}
	
	static void printPrimes(int[] cases) {
		int maxPrime = findMax(cases);
		findPrimes(maxPrime);
		for(int i=0; i<cases.length; i++){
			int primeToFound = cases[i];
			long prime = primes[primeToFound];
			System.out.println(prime);
		}
	}

	private static int findMax(int[] cases) {
		int max = 0;
		for(int i=0; i<cases.length; i++)
			if(max < cases[i])
				max = cases[i];
		return max;
	}

	static void findPrimes(int primeNumber){
		long currentNumber = 3;
		int count = 2;
		primes = new long[primeNumber+1];
		primes[1] = 2;
		while(count <= primeNumber){
			if(isPrime(currentNumber)){
				primes[count] = currentNumber;
				count++;
			}
			currentNumber += 2;
		}
	}

	static boolean isPrime(long number) {
		boolean answer = true;
		 for(int i=3; i*i<=number; i+=2){
             if(number%i==0) {
            	 answer= false;
                 break;
             }
         }
		return answer;
	}
}
