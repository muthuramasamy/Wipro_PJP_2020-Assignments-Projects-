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
