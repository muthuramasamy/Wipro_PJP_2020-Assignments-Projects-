package language_Basics;

import java.util.Scanner;

public class sum {

	/**
	 * @author MUTHU SUNDARAM 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = s1+s2;
		System.out.println( " The sum of  " + s1 + " and " + s2+" is " + s3 );
		sc.close();
		
	}

}
