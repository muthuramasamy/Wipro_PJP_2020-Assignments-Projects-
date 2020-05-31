package flowbasic;

import java.util.Scanner;

public class ascii {

	/**
	 * @author MUTHU SUNDARAM
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c1 =  sc.next().charAt(0);
		if (c1>=65 && c1<=90 || c1>=90 && c1<=112)
		{
			System.out.println("Alphabet");
		}
		else if(c1>=48 && c1<=57)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}

	}

}
