package Exception_handle;

import java.util.Scanner;

public class finally_block {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values of a and b");
		try
		{int a = sc.nextInt();
		int b = sc.nextInt();
		int q= a/b;
		System.out.println("The quotient is: " + q);
		
	}
		catch(ArithmeticException ae)
		{
		System.out.println("Arithmeticexception occurs");
		}
		finally
		{
			System.out.println("Finally Inside block");
		}
	}
}
