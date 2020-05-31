package String_StringBuffer;

import java.util.Scanner;

/**
 * 
 * @author MUTHUSUNDARAM_T
 */
public class remove_x {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to check: ");
		String input1 = sc.nextLine();
		String output = input1.replace("*", "");
		System.out.println(output);

	}

}
