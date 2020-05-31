package flowbasic;

import java.util.Scanner;

public class prime_or_not {

	/**
	 * @author Muthu sundaaram
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int primenum = num/2;
		int flag = 0;
		if (primenum== 0 || primenum== 1)
		{
			System.out.println("NOT A PRIME No:");
			
		}
			for (int i=2;i<primenum;i++)
		{
			if(num%i==0)
			{
				System.out.println("NOT A PRIME NO:");
				flag = 1;
				break;
			}
		}
			if (flag==0)
			{
				System.out.println("THIS IS A PRIME NUMBER");
			}

	}

}
