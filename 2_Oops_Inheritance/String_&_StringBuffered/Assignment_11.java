package String_StringBuffer;

import java.util.Scanner;

/**
 * 
 * @author MUTHUSUNDARAM_T
 */
public class String_occurence {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to check: ");
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		String str = "";
		String finalstr = "";
		StringBuffer snew1 = new StringBuffer(input1);
		StringBuffer snew2 = new StringBuffer(input2);
		int length1 = input1.length();
		int length2 = input2.length();
		
		if(input1.toLowerCase().contains(input2.toLowerCase())==false)
		{
			System.out.println("Input1 does not contain the INput2");
		}
		else
		{
		str = str+input1.replaceAll(input2, "*");	
		}
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == '*' )
			{
				if(i-1>=0)
				{
					finalstr = finalstr + str.charAt(i-1);
				}
				if(i+1 <= str.length()-1)
				{
					finalstr = finalstr + str.charAt(i+1);
				}
			}
			
		}System.out.println(finalstr);
		
	}

}
