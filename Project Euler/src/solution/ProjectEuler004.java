package solution;

import java.util.Scanner;

public class ProjectEuler004 {	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     int casesNumber = scanner.nextInt();
	     for(int i = 0; i < casesNumber; i++){
	    	 long answer = biggestRevesal(scanner.nextInt());
	    	 System.out.println(answer);
	     }
	     scanner.close();
	 }
	
	static int biggestRevesal(int max){
		int solution = 101101;
        for(int i = 100; i <= 999; i++){
            for(int j = i; j <= 999; j++){
                int product = i*j;
                if(product >= max)break;
                int reversal = reverseNumber(product);
                if(reversal == product)
                    if(product > solution) 
                    	solution = product;
            }
        }
        return solution;
	}
	
	static int reverseNumber(int number) {
		int reversal = 0;
		while(number > 0){
			reversal *= 10;
			reversal += number%10;
            number /= 10;
        }
		return reversal;
	}
}
