package flowbasic;

import java.util.Scanner;

public class array_split_comma {

	/**
	 * @author MUTHU SUNDARAM
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s1= sc.nextLine();
		int a = s1.length();
		if (a==0)
		{
			System.out.println("NO VALUES");
		}
		else
		{
			System.out.println(s1.replace(" ", ","));
		}

	}

}
