package String_StringBuffer;
/**
 * 
 * @author MUTHUSUNDARAM_T
 */
import java.util.Scanner;

public class remove_star_lft_ri8 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input here : ");
		String input1 = sc.nextLine();
		StringBuffer sb1= new StringBuffer(input1);
		for(int i=0;i<sb1.length();i++)
		{
		char ch = sb1.charAt(i) ;
		if (ch=='*')
		{
			sb1.delete(i-1,i);
			sb1.delete(i,i+1);
		}
		}		
		input1 = sb1.toString();
		input1 = input1.replace("*","");
		System.out.println(input1);
	}
	

}
