package String_StringBuffer;

import java.util.Scanner;

/**
 * 
 * @author MUTHUSUNDARAM_T
 */
public class length_of_string {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input here : ");
		String input1 = sc.nextLine();
		StringBuffer sb1= new StringBuffer(input1);
		int n = sc.nextInt();
		String sub = input1.substring(sb1.length()-n,sb1.length());
		String finaloutput = "";
		for(int i=0;i<n;i++)
		{
			finaloutput = finaloutput + sub;
			
		}
		System.out.println(finaloutput);
	}

}
