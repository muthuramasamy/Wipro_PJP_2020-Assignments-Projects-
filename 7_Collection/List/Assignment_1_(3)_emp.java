package List;

/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
public class employee_class_2 {

	int empId;
	String empName;
	String email;
	String gender; 
	float salary;
	
	public void  getempoyeedetails()
	{
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("-----------------");
		System.out.println("Employee ID :" + empId);
		System.out.println("Employee Name : "+ empName);
		System.out.println("Employee email id : "+ email);
		System.out.println("Employee GENDER : " + gender);
		System.out.println(" Salaray of EMployee : " + salary);
	}
}
