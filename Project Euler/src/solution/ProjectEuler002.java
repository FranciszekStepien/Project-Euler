package solution;

import java.util.Scanner;

public class ProjectEuler002 {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int casesNumber =inputData.nextInt();
        for(int i=0; i<casesNumber; i++){
        	long answer = sumOfEvenFibonacci(
        			inputData.nextLong());
	    	System.out.println(answer);
        }
        inputData.close();
    }
	
	static long sumOfEvenFibonacci(long number) {
		long solution = 0;
		long lowerFibonacci= 1;
		long greaterFibonacci= 2;
        while(greaterFibonacci <= number){
        	if(greaterFibonacci%2 == 0)
        		solution += greaterFibonacci;
        	greaterFibonacci += lowerFibonacci;
        	lowerFibonacci = greaterFibonacci - lowerFibonacci;
        }
        return solution;
	}
}
