package Set;

import java.util.*;

/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
public class Hash_set {

	
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Muthu");
		hs.add("Susi");
		hs.add("Susi");
		
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
