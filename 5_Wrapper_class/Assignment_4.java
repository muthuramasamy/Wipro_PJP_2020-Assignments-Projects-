 /**
Create an employee class with properties of your choice.Create an object 
of this class and also create a clone of the same.After making the clone, 
change the properties of the original employee object and print 
the properties of both the original and clone object and note down your observation.
**/




package wrapping;
/*
*Author Muthusundaram
*/
import java.util.*;
public class employee implements Cloneable {
	String Name;
	public void Employee (String Name)
	{
		this.Name = Name;
	}
	public  String getname()
	{
		return Name;
	}
	public void setname(String Name)
	{
		this.Name = Name;
	}
	@Override
	public employee clone()
	{
		try
		{
			return (employee) super.clone();
		}
		catch(Exception e)
		{
			System.out.println("Clonning NOt Allowed ");
			return this;
		}
	}
	public static void main(String[] args) {
		Scanner nam = new Scanner(System.in);
		String n = nam.nextLine();
		employee e = new employee();
		employee empc = e.clone();
		empc.setname(n);
		System.out.println(empc.getname());
		System.out.println(e.getname());
		
		
		
		
		

	}

}
