/**
	 * @Author MUTHUSUNDARAM_T
	 */
public class Teacher extends anotherperson{

	double salary;
	String subject;
	public Teacher(String name, String dob,double salary,String subject) 
	{
		super(name, dob);
		this.salary= salary;
		this.subject= subject;
	}
	  public void show() {
		  System.out.println("Teacher name is: " + name);
		  System.out.println("Teacher age is: " +dob);
		  System.out.println("Salary is: " + salary);
		  System.out.println("Subject is " + subject);

	
	  }
	

}
