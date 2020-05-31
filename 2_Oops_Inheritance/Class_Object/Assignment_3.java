package Class;

public class Patient {

	/**
	 * @author MUTHUSUNDARAM_T
	 */
	static String patient_name="MUTHU ";
	double height = 0;
	double weight = 0;
	
	public static double ComputeBMI(double weight,double height)
	{
		double BMI = weight + (height*height);
		return BMI;
	}
	public static void main(String[] args) {
		Patient p = new Patient();
		System.out.println("The BMI of " + patient_name + "is" + p.ComputeBMI(94.5, 1.8));

	}

}
