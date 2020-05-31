/**
	 * @Author MUTHUSUNDARAM_T
	 */
public class college_stu extends Student {
	String Collegename;
	int year;
	public college_stu(String name, String dob, int stuId,int year,String Collegename) {
		super(name, dob, stuId);
		this.year=year;
		this.Collegename=Collegename;
		
	}
	public void show() {
		System.out.println("The student name is: " + name);
		System.out.println("Age is: " + dob);
		System.out.println("Year is: " + year);
		System.out.println("Major is: " +stuId);
		System.out.println("The college name is: "+Collegename);
	}

	
	

}
