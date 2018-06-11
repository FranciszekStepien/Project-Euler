package solution;

import java.math.BigInteger;
import java.util.Scanner;

public class ProjectEuler013 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numbers = scanner.nextInt();
		BigInteger sum = BigInteger.valueOf(0);
		for(int i = 0; i < numbers; i++) {
			sum = sum.add(new BigInteger(scanner.next()));
		}
		scanner.close();
		printAnswer(sum);
	}

	private static void printAnswer(BigInteger sum) {
		String number = sum.toString();
		number = number.substring(0, 10);
		System.out.println(number);
	}
}
