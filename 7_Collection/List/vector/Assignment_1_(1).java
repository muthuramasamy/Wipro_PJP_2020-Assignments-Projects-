package List;

import java.util.*;

/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
public class Employee_vector {

	public static void main(String[] args) {
		Vector<Employee_objects> vec = new Vector<Employee_objects>();
		Employee_objects emp = new Employee_objects();
		emp.empname("Muthu");
		emp.empcmp_name("WIPRO");
		emp.empdob("16-09-1998");
		emp.empid(310816);
		emp.empsalary(50000);
		vec.add(emp);
		
		Iterator<Employee_objects> itr = vec.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			System.out.println();
		}
;

	}

}
