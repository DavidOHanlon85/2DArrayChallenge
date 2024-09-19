/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise11_2DArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] new2DArray = createArray(4, 4);
		
		new2DArray = populateThe2DArray(new2DArray);
		System.out.println();
		display2DArray(new2DArray);
		System.out.println();
		totalAndAverage(new2DArray);
	}

	/**
	 * This method prints the total of all integers in the 2D Array as well as the average of these integers
	 * @param new2DArray
	 */
	public static void totalAndAverage(int[][] new2DArray) {
		int total = 0;
		int totalNumberOfElements = 0;
		
		for (int i = 0; i < new2DArray.length; i++) {
			for( int j = 0; j < new2DArray[i].length; j++){
				total += new2DArray[i][j];
				totalNumberOfElements++;
			}
		}
		System.out.println("The total of all values in the 2D Array is: " + total);
		System.out.println();
		
		double averageOf2DArray = (double) total / (totalNumberOfElements);
		System.out.printf("The average of the 2D Array (to 2 decimal places): %.2f", averageOf2DArray);
	}

	/**
	 * This method displays the 2D Array to console.
	 * @param new2DArray
	 */
	public static void display2DArray(int[][] new2DArray) {
		for (int i = 0; i < new2DArray.length; i++) {
			for(int j = 0; j< new2DArray[i].length; j++) {
				System.out.print("[" + new2DArray[i][j] + "]\t");
			}
			System.out.println();
		}
	}
	
/** 
 * This method populates the 2D array in multiples of two starting at 2 and traversing across rows first
 * @param new2DArray
 * @return - populated new2DArray returned
 */	
	public static int[][] populateThe2DArray(int[][] new2DArray) {
		int counter = 0;
		
		for (int i = 0; i < new2DArray.length; i++) {
			for (int j = 0; j < new2DArray[i].length; j++) {
				new2DArray[i][j] = 2 + counter * 2;
				counter++;
			}
		}
		return new2DArray;
	}

	/** 
	 * This method creates a 2D array of desired rows and colums
	 * @param row - number of required rows
	 * @param column - number of required columns
	 * @return - return the created 2D array of desired size
	 */
	public static int[][] createArray(int row, int column) {
		
		int [][] new2DArray = new int [row][column];
		return new2DArray;
	}

}
