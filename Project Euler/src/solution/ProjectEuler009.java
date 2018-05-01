package solution;

import java.util.Scanner;

public class ProjectEuler009 {
	static int pythagoreanTripletSum;
	static int maxLength;
	
	static int firstLength;
	static int secondLength;
	static int thirdLength;
	
	static long maxProduct;
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     int casesNumber = scanner.nextInt();
	     for(int i = 0; i < casesNumber; i++) {
	    	 pythagoreanTripletSum = scanner.nextInt();
	    	 maxProduct = -1;
	    	 maxPythagoreanTripletProduct();
	    	 System.out.println(maxProduct);
	     }
	     scanner.close();
	}

	static void maxPythagoreanTripletProduct() {
		maxLength = pythagoreanTripletSum / 3;
		if(pythagoreanTripletSum >= 12)
			findMaxPythagoreanTripletProduct();
	}
	
	static void findMaxPythagoreanTripletProduct() {;
		for(firstLength = maxLength; firstLength >= 3; firstLength--){
			findMaxProduct();
			if(maxProduct != -1)
			        break;
		}		
	}

	static void findMaxProduct() {
		int maxLengthSum = 2 * maxLength;
		for(secondLength = firstLength; 
				firstLength + secondLength < maxLengthSum;
				secondLength++){
			findProduct();
			if(isToBigLength() || maxProduct != -1)
				break;
		}
	}

	static void findProduct() {
		setThirdLength(pythagoreanTripletSum);
		if(isPythagoreanTriplet()) {
			lengthProduct();
		}
	}
	
	static void setThirdLength(int sum) {
		thirdLength = pythagoreanTripletSum - 
				firstLength - secondLength;
	}
	
	static boolean isToBigLength() {
		long firstPythagoreanPart = firstLength * firstLength
				+ secondLength * secondLength;
		long secondPythagoreanPart = thirdLength * thirdLength;
		return (firstPythagoreanPart > secondPythagoreanPart);
	}

	static boolean isPythagoreanTriplet() {
		long firstPythagoreanPart = firstLength * firstLength
				+ secondLength * secondLength;
		long secondPythagoreanPart = thirdLength * thirdLength;
		return (firstPythagoreanPart == secondPythagoreanPart);
	}
	
	static void lengthProduct() {
		long product = firstLength * secondLength * thirdLength;
		maxProduct = product;
	}
}
