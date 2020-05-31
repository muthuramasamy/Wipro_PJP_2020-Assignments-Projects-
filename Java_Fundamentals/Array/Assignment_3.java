package array;

import java.util.Arrays;
import java.util.Scanner;

public class min_max {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] array = {15,1,31,12,4};
		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();
		int flag = 0;
		System.out.println("Enter the search element : " + search);
		for(int i=0;i<array.length;i++)
		{
			if (search == array[i])
			{
				flag = 1;
		}
			}
		if (flag==0)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println("The system founded the element");
		}

	}}
