
package List;
/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Mixed_Array {
	
	public static void main(String[] args) {
		ArrayList<Datatype> al = new ArrayList<Datatype>();
		
		Scanner sc = new Scanner(System.in);
		int input1 =sc.nextInt();
		float input2 = sc.nextFloat();
		double input3 = sc.nextDouble();
		Datatype dta = new Datatype();
		dta.addint(input1);
		dta.addfloat(input2);
		dta.adddouble(input3);

		al.add(dta);
	}

}
