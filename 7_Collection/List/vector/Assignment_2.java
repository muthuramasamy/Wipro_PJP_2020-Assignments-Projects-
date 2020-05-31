package List;

/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Vector_months {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<String> al = new Vector<String>();
		al.add("Januaury ");
		al.add("February");
		al.add("March");
		al.add("April");
		al.add("May");
		al.add("June");
		al.add("July");
		al.add("August");
		al.add("September");
		al.add("October");
		al.add("November");
		al.add("December");
		
		//ITERATING:
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
