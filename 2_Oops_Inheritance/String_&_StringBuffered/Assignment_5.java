package String_StringBuffer;

import java.util.Scanner;

/**
 * 
 * @author MUTHUSUNDARAM_T
 */
public class first_last_remove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to check: ");
		String input = sc.nextLine();
		StringBuffer snew = new StringBuffer(input);
		int length = input.length();
		String output = snew.substring(1,length-1);
		System.out.println("Theoutput String is : " + output);
	}

}
