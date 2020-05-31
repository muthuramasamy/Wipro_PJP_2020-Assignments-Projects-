package String_StringBuffer;

import java.util.Scanner;

/**
 * 
 * @author MUTHUSUNDARAM_T
 */
public class palindrome_str {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to check ?..");
		String str = sc.nextLine();
		StringBuffer s = new StringBuffer(str);
		s = s.reverse();
		String sam = s.toString();
		if(str.equals(sam)){
			System.out.println("Palindrome..!");
		}
		else
		{
			System.out.println("Not a Palindrome..!");
		}
		

	}

}
