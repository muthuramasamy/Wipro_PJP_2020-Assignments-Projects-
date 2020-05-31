/**
	 * @author MUTHUSUNDARAM_T
	 */
public class employee extends person {

	String Insnum;
	int year;
	double salary;
	
	public employee (String name,String Insnum,int year,double salary)
	{   super(name);
		this.Insnum= Insnum;
		this.year=year;
		this.salary=salary;
	}
	
	public void display()
	{
		System.out.println("Employee name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Year of joining: " + year);
		System.out.println("Insurance_number: " + Insnum);
	}

}
