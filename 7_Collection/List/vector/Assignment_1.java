package List;
/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
public class Employee_objects {
	String name;
	double salary;
	String dob;
	int id;
	String company_name;
	public void empname(String ename)
	{
		this.name = ename;
	}
	public void empsalary(double esalary)
	{
		this.salary = esalary;
	}
	public void empdob(String edob)
	{
		this.dob = edob;
	}
	public void empid(int eid)
	{
		this.id = eid;
	}
	public void empcmp_name(String cmname)
	{
		this.company_name = cmname;
	}
	public String toString() {
		return "Employee id: " + id + "\nEmployee name: " + name + "\nEmployee dob: " + dob + "\nEmployee Companyname: " + company_name + "\nSalary: " + salary;
	}

}







