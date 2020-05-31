package array;

import java.util.Arrays;

public class min_max {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] array = {15,1,31,12,4};
		Arrays.sort(array);
		int max = array[array.length-1];
		int min = array[0];
		System.out.println("The min and max values are : " + min +" "+max);
		

	}

}
