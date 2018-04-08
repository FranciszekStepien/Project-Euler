package solution;

import java.util.Scanner;

public class ProjectEuler001 {
	public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int casesNumber =inputData.nextInt();
        for(int i=0; i<casesNumber; i++){
            sol(inputData.nextLong());
        }
        inputData.close();
    }
	
	static void sol(long number){
        long b=(number-1)/3;
        long c=(number-1)/5;
        long d=(number-1)/15;
        System.out.println(b*(b+1)/2*3+c*(c+1)/2*5-d*(d+1)/2*15);   
    }
}
