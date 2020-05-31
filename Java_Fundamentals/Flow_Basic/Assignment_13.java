package flowbasic;

import java.util.Scanner;

public class prime_between {

	/**
	 * @Author Muthu sundaram
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String st = " ";
		for (int i=1;i<=n;i++)
		{int count = 0;
			for (int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
				count = count+1;
				}
		}
			if (count==2)
			{
				st = st +i + " ";
			}
		}
		System.out.println("The prime numbers between those numbers are :" + st);
		
	}
}
