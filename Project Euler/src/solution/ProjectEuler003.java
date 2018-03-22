package solution;

import java.util.Scanner;

public class ProjectEuler003 {
	public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int casesNumber =inputData.nextInt();
        for(int i=0; i<casesNumber; i++){
        	long answer = maxPrimeFactors(inputData.nextLong());
	    	System.out.println(answer);
        }
        inputData.close();
    }
	
	static long maxPrimeFactors(long number) {
		long solution = 2;
		number = removeMultipler(solution, number);
        for(long a = 3; a*a <= number; a += 2){
            if((number % a) == 0){
            	solution = a;
            	number = removeMultipler(a, number);
            }    
        }
        if(number > solution) 
        	solution = number;
        return solution;
	}
	
	static long removeMultipler(long mulipler, long number){
		while((number % mulipler) == 0){
            number /= mulipler;
        }
		return number;
	}
}
