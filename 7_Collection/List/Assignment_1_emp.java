package List;

/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Employee_db {
		ArrayList<employee_class_2> al = new ArrayList<employee_class_2>();
		
		
		public boolean addemployee(employee_class_2 emp)
		
		{
		al.add(emp);
		System.out.println("\n");
		return true;
		}
		public boolean delemployee(int empId)
		{
			Iterator<employee_class_2> it = al.iterator();
			while(it.hasNext())
			{
				if(it.next().empId == empId)
				{
					it.remove();
					System.out.println("EMPLOYEE REMOVED");
					break;
				}
				else
				{
					System.out.println("EMPLOYE ID is not found.");
				}
			}
			return true;
			
		}
		
		public String showpayslip(int empId)
		{
			Iterator <employee_class_2> itr = al.iterator();
			while (itr.hasNext())
			{	employee_class_2 temp=itr.next();
				if(temp.empId==empId)
				{
					return "PAY slip of the employee is " + temp.salary;				}
			
		}
			return "Employee not found";


		}}
