package String_StringBuffer;

import java.util.Scanner;

/**
 * 
 * @author MUTHUSUNDARAM_T
 */
public class string_concat {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�nter the string to concat: ");
		String str = sc.nextLine();
		String str1 = sc.nextLine();
		str = str.toLowerCase();
		str1 = str1.toLowerCase();
		System.out.println(" The Concatened string is : " +str+" "+str1);
	}

}
