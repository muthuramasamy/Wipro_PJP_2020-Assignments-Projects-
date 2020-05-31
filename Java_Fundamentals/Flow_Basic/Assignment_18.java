package flowbasic;

import java.util.Scanner;

public class palindrome {

	/**
	 * @author muthusundaram
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reverse=0;
		int tempor = num;
		while(num>0)
		{
			int temp = num % 10;
			reverse = (reverse*10)+temp;
			num = num/10;
		}
		if(reverse == tempor)
		{
			System.out.println("THe Number is palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}

	}

}
