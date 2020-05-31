package array;

import java.util.Arrays;

public class sort_array {

	/**
	 * @author Muthu Sundaram
	 */
	public static void main(String[] args) {
		int [] array = {15,1,31,12,4};
		Arrays.sort(array);
		for(int i = 0;i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}

	}

}
