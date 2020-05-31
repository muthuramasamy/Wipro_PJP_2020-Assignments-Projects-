package Class;

import java.util.*;
import java.io.*;
public class Calculator {
	
	public static double powerInt(int a,int b)
	{return Math.pow(a,b);
	}
	public static double DoubleInt(double a,double b)
	{
		return Math.pow(a,b);
	}
public static void main(String[] args)
{
	Calculator c = new Calculator();
	System.out.println("The Integer value : " + c.powerInt(2,3));
	System.out.println("The double value  : " + c.DoubleInt(5.0, 3.0));
}
}
