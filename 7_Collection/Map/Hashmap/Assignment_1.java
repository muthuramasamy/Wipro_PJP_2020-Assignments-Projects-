package Map;
import java.util.*;
import java.util.Map.Entry;
/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
public class Hashmap_1_Countrycapitals {

	HashMap<String,String> H1 = new HashMap<String,String>();
	public HashMap<String,String> saveCountryCap(String Countryname,String Capname)
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
	public HashMap<String,String> swapmap()
	{
		HashMap<String,String> H2 = new HashMap<String,String>();
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
		Hashmap_1_Countrycapitals has = new Hashmap_1_Countrycapitals();
		has.saveCountryCap("INDIA","DELHI");
		has.saveCountryCap("JAPAN","TOKYO");
		
		System.out.println();
		System.out.println(has.getCapital("INDIA"));
		System.out.println(has.getCountry("TOKYO"));
		
		HashMap<String, String> m= has.swapmap();
		System.out.println(m);
		
		ArrayList<String> al = has.Arraylist();
		System.out.println((String)al.toString());
	}

}
