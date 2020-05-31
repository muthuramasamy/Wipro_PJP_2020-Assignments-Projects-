/*
Write a java program which generates the minimum and maximum value for each of the 
Numeric Wrapper classes (Byte, Short, Integer, Long, Float, Double)
Sample Output:
Integer range: 
min: -2147483648 
max: 2147483647 
Double range: 
min: 4.9E-324 
max: 1.7976931348623157E308 
Long range: 
min: -9223372036854775808 
max: 9223372036854775807 
Short range: 
min: -32768 
max: 32767 
Byte range: 
min: -128 
max: 127 
Float range: 
min: 1.4E-45
max: 3.4028235E38 
 * */



package wrapping;

public class min_max {
	public static void main(String args[])
	{
		//INTEGER
	System.out.println("Integer range");
	System.out.println("min value:"+ Integer.MIN_VALUE);
	System.out.println("max value:"+ Integer.MAX_VALUE);
	
	   //FLOAT
	System.out.println("Float range");
	System.out.println("min value:"+ Float.MIN_VALUE);
	System.out.println("max value:"+ Float.MAX_VALUE);
	
	  //DOUBLE
	System.out.println("DOUBLE range");
	System.out.println("min value:"+ Double.MIN_VALUE);
	System.out.println("max value:"+ Double.MAX_VALUE);
	
	  //LONG
	System.out.println("LONG range");
	System.out.println("min value:"+ Long.MIN_VALUE);
	System.out.println("max value:"+ Long.MAX_VALUE);
	
	  //SHORT
	System.out.println("SHORT range");
	System.out.println("min value:"+ Short.MIN_VALUE);
	System.out.println("max value:"+ Short.MAX_VALUE);
	
	  //BYTE
	System.out.println("BYTE range");
	System.out.println("min value:"+ Byte.MIN_VALUE);
	System.out.println("max value:"+ Byte.MAX_VALUE);
	}
}
