package String_StringBuffer;

/**
 * 
 * @author MUTHUSUNDARAM_T
 */
import java.util.Scanner;

public class Half_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to check: ");
		String input = sc.nextLine();
		StringBuffer snew = new StringBuffer(input);
		int length = input.length();
		if(length%2 ==0)
			
		{
			String cut = snew.substring(0,length/2);
			System.out.println(" The output is: "  +  cut);
			
			
		}
		else
		{
			System.out.println(" NUll ");
		}
}}
