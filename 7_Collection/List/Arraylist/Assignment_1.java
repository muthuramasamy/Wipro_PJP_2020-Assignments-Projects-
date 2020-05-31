package List;

import java.util.*;

/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
public class Array_list_months {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
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
