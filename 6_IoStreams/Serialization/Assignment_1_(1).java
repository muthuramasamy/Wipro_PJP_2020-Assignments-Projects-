package IOstream;
import java.util.*;
import java.io.*;
public class Employee implements Serializable{
	String name;
	String department;
	String designation;
	double salary;
	Date dob;
	
	public Employee()
	{	
	}
	
	public Employee(String name,String department,String designation,double salary,Date dob)
	{
		this.name = name;
		this.department= department;
		this.designation= designation;
		this.salary = salary;
		this.dob=dob;
	}
	
	//SETTER
	public void setname(String name)
	{
		this.name=name;
	}
	public void setdepartment(String department)
	{
		this.department =department;
	}
	public void setdesignation(String designation)
	{
		this.designation=designation;
	}
	public void setdob(Date dob)
	{
		this.dob=dob;
	}
	public void setsal(double salary)
	{
		this.salary=salary;
	}
	
	//GETTER
	public String getname()
	{
		return name;
	}
	public String getdepartment()
	{
		return department;
	}
	public String getdesignation()
	{
		return designation;
	}
	public Date getdob()
	{
		return dob;
	}
	public double getsal()
	{
		return salary;
	}
	public String toString() 
	{
		return "\n The name of the employeeis : " + getname() + "\nThe date of birth is : " +
				 getdob ()+ "\n The desgination is :" + getdesignation()+
				 "\n The department of the employee is :" +getdepartment()+
				 "\n the salary of the employee is :" +getsal() ;

	}

}


//SERIALIZATION:
package IOstream;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
public class serialization_employee {

	/**
	 * @author MUTHUSUNDARAM
	 */
	public static void main(String[] args) throws Exception{
		try
		{
			String date1 = "16/09/1998";
			Date d1=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(date1);  
			Employee obj = new Employee("MUTHU","IT","ASSOCIATE SOFTWARE ENGINEER",30000,d1);
			FileOutputStream fos = new FileOutputStream("data");
			ObjectOutputStream out= new ObjectOutputStream(fos);
			out.writeObject(obj);
			out.flush();
			out.close();
		
		}
		catch(Exception e)
		{
			System.out.println("THE Exception Occurs");
			e.printStackTrace();
		}

	}

}


//DESERIALIZATION

package IOstream;
import java.io.*;
import java.util.*;
public class deserialization_employee {

	/**
	 * @Author MUTHU SUNDARAM
	 */
	public static void main(String[] args) {
		
		try{
			Employee obj2;
			
			FileInputStream fin = new FileInputStream("data");
			ObjectInputStream out = new ObjectInputStream(fin);
			
			obj2 = (Employee)out.readObject();
			out.close();
			System.out.println("The OBJECT IS DISPLAYED : " + obj2);
		}
		catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
			return ;
		} catch (ClassNotFoundException e) {
			System.out.println("Error: " + e);
			return ;
		} catch (IOException e) {
			System.out.println("Error: " + e);
			return ;
		}
	}

}
