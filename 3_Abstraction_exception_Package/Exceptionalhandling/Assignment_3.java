package Exception_handle;

import java.util.Scanner;

public class exception_handle_multiplecatch {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of elements to be stored in the array");
		int num_consist = sc.nextInt();
		int [] arr= new int[num_consist];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<arr.length;i++)
		{
			 arr[i] = sc.nextInt();
		}
		try
		{
		System.out.println("Enter the index of the array element you want to access");
		int user_ind = sc.nextInt();
		System.out.println("The array element : " +user_ind+" is "+arr[user_ind]);
		System.out.println("The element cane be accesed successfully..!");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("The class element_check creating ArrayindexOutOfNoundsException ");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("The clas element occurs NUmberformatException");
		}
		}

}
