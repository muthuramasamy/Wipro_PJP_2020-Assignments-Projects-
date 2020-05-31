package array;

import java.util.Arrays;

public class largest2_smallest2 {

	/**
	 * @author muthu sundaram
	 */
	public static void main(String[] args) {
		int [] array = {15,1,31,12,4};
		Arrays.sort(array);
		int largest1= array[array.length-1];
		int largest2=array[array.length-2];
		int smallest1 = array[0];
		int smallest2 = array[1];
		System.out.println("The first largest " +largest1+ "; Second largest "+largest2+
				"; smallest1 "+smallest1+"; smallest2 "+smallest2);
		

	}

}
