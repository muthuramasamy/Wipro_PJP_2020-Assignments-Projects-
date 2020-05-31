package String_StringBuffer;
/**
 * 
 * @author MUTHUSUNDARAM_T
 */
import java.util.Scanner;

public class shortlongshort {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to check: ");
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		String small="";
		String big = "";
		if(input1.length()== input2.length())
		{
			System.out.println("Two input length should be different..!");
		}
		else
		{
			if(input1.length()<input2.length())
			{
				small = input1;
				big = input2;
			}
			else
			{
				small= input2;
				big = input1;
			}
		}
		System.out.println("The output is: " +small+big+small);

	}

}
