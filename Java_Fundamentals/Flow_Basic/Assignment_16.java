package flowbasic;

import java.util.Scanner;

public class floyd_star {

	/**
	 * @Author Muthu SUndaram
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int i = 1;i<=number;i++)
		{
			for(int j=0;j<i;j++)
			{
			System.out.print("* ");
		}System.out.println();
			}
		

	}

}
