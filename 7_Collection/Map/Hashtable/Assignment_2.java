package Map;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Hashtable_5_capitals {

	/**
	 * @author MUTHUSUNDARAM_T
	 */
	public static void main(String[] args) throws ClassCastException{
		Properties p= new Properties();
		p.put("Tamilnadu", "Chennai");
		p.put("UttarPradesh","Lucknow");
		p.put("Orrisa","Bhuvaneshwar");
		p.put("Karnataka","Banglore");
		p.put("Punjab","Chandigargh");
		p.put("Uttarkhand","Deradun");
		
		Set set = p.entrySet();
		Iterator i = set.iterator();
		System.out.println("The capital are : ");
		while(i.hasNext())
		{
			
			System.out.println(i.next());
		}
		
	}

}
