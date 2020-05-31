package Set;

import java.util.*;

public class Hash_contry_set {
	
	HashSet<String> H1 = new HashSet<String>();
	public HashSet<String> savecountryname(String country_name)
	{
	 H1.add(country_name);
	return H1;
	}
	
	public String getcountryname(String country_name)
	{
		Iterator itr = (Iterator) H1.iterator();
		while(itr.hasNext())
		{
			String cname = (String) itr.next();
			if(cname.equals(country_name))
			{
				return country_name;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Hash_contry_set h2 = new Hash_contry_set();
		Scanner sc = new Scanner(System.in);
		String savecountry_name = null;
		for(int i=0;i<3;i++)
		{System.out.println("Enterthe country name to add: ");
		savecountry_name = sc.nextLine();
		}
		System.out.println("Enter the country name to get:");
		String getcountry_name = sc.nextLine();
		h2.savecountryname(savecountry_name);
		System.out.println(h2.getcountryname(getcountry_name));
			
		
		

	}

}
