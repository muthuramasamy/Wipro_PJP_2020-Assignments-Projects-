package Exception_handle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class average_marks {
	public static void main(String[] args) throws neg_excep, ValueOutOfRange
	{  int average = 0;
		Scanner sc = new Scanner (System.in);
		int marka1 =0;
		int marka2 = 0;
		int marka3 =0;
		int markb1 = 0;
		int markb2 = 0;
		int markb3 = 0;
		//1st student:
		
		System.out.println("Enter the 1st student name: ");
		String nam1 = sc.nextLine();
		System.out.println("Enter the marks : ");
		 try
		 {marka1 = sc.nextInt();
		 marka2 = sc.nextInt();
		 marka3 = sc.nextInt();
		if(marka1<1 || marka1>100 || marka2<1 ||marka2>100 || marka3<1 || marka3>100 )
		{
			
			throw new ValueOutOfRange();
		}sc.nextLine();
		}catch(Exception e)
		{	
			e.printStackTrace();
			System.exit(0);
		}
		
		
		//2nd student:
		System.out.println("Enter the 2nd student name: ");
		String nam2 = sc.nextLine();
		
		System.out.println("Enter the marks : ");
		try
		{
		 markb1 = sc.nextInt();
		 markb2 = sc.nextInt();
		 markb3 = sc.nextInt();
		if(markb1<1 || markb1>100 || markb2<1 ||markb2>100 || markb3<1 || markb3>100 )
		{
			
			throw new ValueOutOfRange();
			}
		}
		catch (InputMismatchException e) {
			System.out.println("OOps! please enter the integer value only.");
			System.exit(0);
		}
		System.out.println("the average is: " + (marka1+marka2+marka3+markb1+markb2+markb3)/3.0);
	

		}
	
}

