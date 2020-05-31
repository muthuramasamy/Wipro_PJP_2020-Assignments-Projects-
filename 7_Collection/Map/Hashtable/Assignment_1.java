package Map;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashtable_6_Countrycapitals {
		Hashtable<String,String> H1 = new Hashtable<String,String>();
		public Hashtable<String,String> saveCountryCap(String Countryname,String Capname)
		{
			H1.put(Countryname,Capname);
			return H1;
		}
		public String getCapital(String Countryname)
		{
			Enumeration country;
			country = H1.keys();
			String str;
			while(country.hasMoreElements())
			{
				str = (String)country.nextElement();
				if(str.equals(Countryname))
				{
					return H1.get(str);
				}
			}
			return null;
		}
		
		public String getCountry(String Capital)
		{
			Enumeration capital;
			String str1;
			capital = H1.keys();
			while (capital.hasMoreElements())
			{
				str1 = (String)capital.nextElement();
				String country = H1.get(str1);
				if(country.equals(Capital))
				{
					return str1;
				}
			}
			return null;
		}
		public Hashtable<String,String> swapmap()
		{
			Hashtable<String,String> H2 = new Hashtable<String,String>();
			
			Enumeration en;
			en = H2.keys();
			
			while(en.hasMoreElements())
			{
				String country = (String)en.nextElement();
				String capi = H2.get(country);
				H2.put(capi,country);
			}
			return H2;
		}
		public ArrayList<String> Arraylist()
		{
			ArrayList<String> al = new ArrayList<String>();
			Enumeration en;
			String str;
			en = H1.keys();
			while(en.hasMoreElements())
			{
				al.add((String)en.nextElement());
			}
			return al;
			
		}
		
		
		public static void main(String[] args) {
			Hashtable_6_Countrycapitals has = new Hashtable_6_Countrycapitals();
			has.saveCountryCap("INDIA","DELHI");
			has.saveCountryCap("JAPAN","TOKYO");
			
			System.out.println();
			System.out.println(has.getCapital("INDIA"));
			System.out.println(has.getCountry("TOKYO"));
			
			Hashtable<String, String> m= has.swapmap();
			System.out.println(m);
			
			ArrayList<String> al = has.Arraylist();
			System.out.println((String)al.toString());
		}

	}

