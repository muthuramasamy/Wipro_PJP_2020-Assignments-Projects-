package flowbasic;

import java.util.Scanner;

public class reverse {

	/**
	 * @Author muthusundaram
	 */
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int reverse=0;
			while(num>0)
			{
				int temp = num % 10;
				reverse = (reverse*10)+temp;
				num = num/10;
			}
			System.out.println("THE SUM IS : " + reverse);

	}

}
