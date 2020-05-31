package flowbasic;

import java.util.Scanner;

public class sum_of_digits {

	/**
	 * @author Muthu Sundaram
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum1= 0;
		while(num>0)
		{
			int temp = num % 10;
			sum1 = sum1+temp;
			num = num/10;
		}
		System.out.println("THE SUM IS : " + sum1);
		

	}

}
