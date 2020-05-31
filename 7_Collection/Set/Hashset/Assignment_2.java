package Set;

import java.util.*;

public class Tree_country_set {
	
	TreeSet<String> T1 = new TreeSet<String>();
	public TreeSet<String> savecountryname(String country_name)
	{
	 T1.add(country_name);
	return T1;
	}
	
	public String getcountryname(String country_name)
	{
		Iterator itr = (Iterator) T1.iterator();
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
