package flowbasic;

import java.util.Scanner;

public class uppercase_lowercase {

	/**
	 * @author muthu sundaram
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		boolean check = Character.isUpperCase(ch);
		if (check)
		{
		System.out.println(Character.toLowerCase(ch));	
		}
		else
		{
			System.out.println(Character.toUpperCase(ch));
		}
	} 

}
