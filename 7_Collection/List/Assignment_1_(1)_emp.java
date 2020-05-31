package List;

/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
public class employee_demo {
	public static void main(String[] args) {
		employee_class_2 obj = new employee_class_2();
		Employee_db obj2 = new Employee_db();
		obj.empName ="Xyz";
		obj.empId = 1;
		obj.email = "Xyz@gmail.com";
		obj.gender = "Male";
		obj.salary = 90000;
		obj2.addemployee(obj);
		
		employee_class_2 obj3 = new employee_class_2();
		obj3.empName ="Abhish";
		obj3.empId = 2;
		obj3.email = "abi@gmail.com";
		obj3.gender = "Male";
		obj3.salary = 70000;
		obj2.addemployee(obj3);
		
		
		employee_class_2 obj4 = new employee_class_2();
		obj4.empName ="Neha";
		obj4.empId = 3;
		obj4.email = "neha@gmail.com";
		obj4.gender = "Female";
		obj4.salary = 60000;
		obj2.addemployee(obj4);
		
		System.out.println(obj2.showpayslip(2));
		obj. getempoyeedetails();
		obj2.delemployee(1);
		}

	}


