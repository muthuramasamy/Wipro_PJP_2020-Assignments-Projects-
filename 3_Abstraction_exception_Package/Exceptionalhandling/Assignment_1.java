package Exception_handle;
/**
 * 
 * @author MUTHUSUNDARAM_T
 */
import java.util.*;
import java.io.*;
public class integer {
public static void main(String[] args)
{
	int number=0;
	int flag = 0;
	Scanner sc = new Scanner(System.in);
	try
	{
		number =sc.nextInt();
	}
	catch(Exception e)
	{
		System.out.println("Enter the proper integer");
	    flag = 1;
	}
	if(flag ==0)
	{
		
		System.out.println("The Square value is "+ (number * number));
		System.out.println("The value is entered successfully");
	}
}
}
