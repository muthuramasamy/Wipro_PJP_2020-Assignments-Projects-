package flowbasic;

import java.util.Scanner;

public class pos_neg_zer {

	/**
	 * @author MUTHU SUNDARAM
	 */
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner (System.in);
		int s1 = sc.nextInt();
		if(s1%2 == 0)
		{
			System.out.println("EVEN");
		}
		else
		{
			System.out.println("ODD");
		}
		

	}

}
