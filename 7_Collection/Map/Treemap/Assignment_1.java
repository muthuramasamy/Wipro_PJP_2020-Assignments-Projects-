package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
public class Treemap_5_Countrycapitals {
	TreeMap<String,String> H1 = new TreeMap<String,String>();
	public TreeMap<String,String> saveCountryCap(String Countryname,String Capname)
	{
		H1.put(Countryname,Capname);
		return H1;
	}
	public String getCapital(String Countryname)
	{
		Set set = H1.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry)i.next();
			if(me.getKey().equals(Countryname));
			{
				return  "The Capital is " + me.getValue();
			}
		}
		return null;
	}
	
	public String getCountry(String Capital)
	{
		Set set = H1.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry)i.next();
			if(me.getKey().equals(Capital));
			{
				return  "The Country is " + me.getKey();
			}
		}
		return null;
	}
	public TreeMap<String,String> swapmap()
	{
		TreeMap<String,String> H2 = new TreeMap<String,String>();
		Set set = H1.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry me2 = (Map.Entry)it.next();
			H2.put((String)me2.getKey(),(String)me2.getValue());
		}
		return H2;
	}
	public ArrayList<String> Arraylist()
	{
		ArrayList<String> al = new ArrayList<String>();
		Set set = H1.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext())
		{
		Map.Entry me = (Map.Entry)i.next();
		al.add((String)me.getKey());
		}
		return al;
		
	}
	
	
	public static void main(String[] args) {
		Treemap_5_Countrycapitals has = new Treemap_5_Countrycapitals();
		has.saveCountryCap("INDIA","DELHI");
		has.saveCountryCap("JAPAN","TOKYO");
		
		System.out.println();
		System.out.println(has.getCapital("INDIA"));
		System.out.println(has.getCountry("TOKYO"));
		
		TreeMap<String, String> m= has.swapmap();
		System.out.println(m);
		
		ArrayList<String> al = has.Arraylist();
		System.out.println((String)al.toString());
	}
}
