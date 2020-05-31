package String_StringBuffer;

import java.util.Scanner;

/**
 * 
 * @author MUTHUSUNDARAM_T
 */
public class char_allign {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input here : ");
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		StringBuffer sb1= new StringBuffer(input1);
		StringBuffer sb2=new StringBuffer(input2);
		StringBuffer output =new StringBuffer("");
		int maxlength = Math.max(sb1.length(), sb2.length());
		for(int i=0;i<maxlength;i++)
		{
			if(i<sb1.length())
			{
				output.append(sb1.charAt(i));
			}
			if(i<sb2.length())
			{
				output.append(sb2.charAt(i));
			}
		}
		
		
		
		System.out.println("The output string is : "+output);


	}

}
