
/*
Accept a integer number as Command line argument from the program and when the program 
is executed print the binary, octal and hexadecimal equivalent of the given number.
Sample Output:
java  Test 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
Refer Java Documentation and look for the appropriate Wrapper class method
 * */




package wrapping;
/*
*Author Muthusundaram
*/
import java.util.*;
public class bin_oct_hexa {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		System.out.println("The INTEGER Numbers to be converted into ");
		System.out.println("To Octatl:" + Integer.toOctalString(number));
		System.out.println("To Hexadecimal" + Integer.toHexString(number));
		System.out.println("To Binary" + Integer.toBinaryString(number));
		
		
	}

}
