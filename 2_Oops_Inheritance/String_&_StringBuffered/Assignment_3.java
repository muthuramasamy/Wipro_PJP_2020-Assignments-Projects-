Apackage String_StringBuffer;

import java.util.Scanner;

/**
 * 
 * @author MUTHUSUNDARAM_T
 */
public class string_mul {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to check: ");
		String name = sc.nextLine();
		StringBuffer snew = new StringBuffer(name);
		int length = name.length();
		String output="";
		String sub = snew.substring(0,2);
		for(int i=0;i<length;i++)
		{
			output = output+sub;
		}
		System.out.println("The output stream is: " + output);
	}

}
