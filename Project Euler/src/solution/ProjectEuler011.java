package solution;

import java.util.Scanner;

public class ProjectEuler011 {
	 private final static int GRID_SIZE = 20;
	static int[][] grid = new int[GRID_SIZE][GRID_SIZE];
	
	public static void main(String[] args) {
		int maxProduct;
		getGrid();
		maxProduct = findMaxProduct();
		System.out.println(maxProduct);		
	}

	private static void getGrid() {
		 Scanner scanner = new Scanner(System.in);
	     for(int i = 0; i < GRID_SIZE; i++) 
	    	 for(int j = 0; j < GRID_SIZE; j++)
	    		 grid[i][j] = scanner.nextInt();
	     scanner.close();
	}
	
	private static int findMaxProduct() {
		int maxProduct;
		maxProduct = checkVertical();
		maxProduct = checkHorizontal(maxProduct);
		maxProduct = checkDiagonally(maxProduct);
		maxProduct = checkInvertedDiagonally(maxProduct);
		return maxProduct;
	}
	
	private static int checkVertical() {
		int maxProduct = 0;
		int product;
		for(int i = 0; i < GRID_SIZE - 3; i++) 
	    	 for(int j = 0; j < GRID_SIZE; j++) {
	    		 product = verticalProduct(i, j);
	    		 maxProduct = Math.max(maxProduct, product);
	    	 }		
		return maxProduct;
	}

	private static int verticalProduct(int i, int j) {
		int product = 1;
		for(int k = 0; k < 4; k++)
			product *= grid[i + k][j];
		return product;
	}

	private static int checkHorizontal(int maxProduct) {
		int product;
		for(int i = 0; i < GRID_SIZE; i++) 
	    	 for(int j = 0; j < GRID_SIZE - 3; j++) {
	    		 product = horizontalProduct(i, j);
	    		 maxProduct = Math.max(maxProduct, product);
	    	 }	
		return maxProduct;
	}

	private static int horizontalProduct(int i, int j) {
		int product = 1;
		for(int k = 0; k < 4; k++)
			product *= grid[i][j + k];
		return product;
	}

	private static int checkDiagonally(int maxProduct) {
		int product;
		for(int i = 0; i < GRID_SIZE - 3; i++) 
	    	 for(int j = 0; j < GRID_SIZE - 3; j++) {
	    		 product = diagonallyProduct(i, j);
	    		 maxProduct = Math.max(maxProduct, product);
	    	 }	
		return maxProduct;
	}

	private static int diagonallyProduct(int i, int j) {
		int product = 1;
		for(int k = 0; k < 4; k++)
			product *= grid[i + k][j + k];
		return product;
	}

	private static int checkInvertedDiagonally(int maxProduct) {
		int product;
		for(int i = 0; i < GRID_SIZE - 3; i++) 
	    	 for(int j = 0; j < GRID_SIZE - 3; j++) {
	    		 product = invertedDiagonallyProduct(i, j);
	    		 maxProduct = Math.max(maxProduct, product);
	    	 }	
		return maxProduct;
	}

	private static int invertedDiagonallyProduct(int i, int j) {
		int product = 1;
		for(int k = 0; k < 4; k++)
			product *= grid[i + k][j + 3 - k];
		return product;
	}	
}
