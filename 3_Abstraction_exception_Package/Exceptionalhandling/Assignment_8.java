package Exception_handle;
import java.util.*;
import java.io.*;
public class propname
{public void sect()
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the name and age");
 String name = sc.nextLine();
 int age1 = sc.nextInt();
 try
 {
	 if(age1>=18 && age1<60)
	 {
		 System.out.println("The age parameter is passed..!");
	 }
	 else
	 {
		 throw new Agelimitexception();
	 }
 }
	catch(Agelimitexception ae)
	{
		ae.printStackTrace();
	}

}
	
}
