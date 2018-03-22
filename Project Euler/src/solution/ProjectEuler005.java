package solution;

import java.util.Scanner;

public class ProjectEuler005 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     int casesNumber = scanner.nextInt();
	     for(int i = 0; i < casesNumber; i++){
	    	 int answer = smallestMultiple(scanner.nextInt());
	    	 System.out.println(answer);
	     }
	     scanner.close();
	}
	
	static int smallestMultiple(int number){
		int solution = 1;
        for(int i=2; i<=number; i++){
            if(solution%i != 0){    
                solution *= biggestPower(i, number);
            }
        }
		return solution;
	}
	
	static int biggestPower(int radix, int max){
		int solution = 1;
		while(solution <= max){
			solution *= radix;
		}
		return solution / radix;
	}
}
