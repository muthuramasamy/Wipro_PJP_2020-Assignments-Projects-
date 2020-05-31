package Map;
import java.util.*;
/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
public class Hashmap_4_string_integer {
	public static void main(String[] args) {
		HashMap<String,Long> hm = new HashMap<String,Long>();
		hm.put("MUTHU", (long) 9629629628L);
		hm.put("Susi",(long) 8258148368L);
		hm.put("PRAVeen",(long) 8527419635L);
		Set set =hm.entrySet();
		Scanner sc = new Scanner(System.in);
		
		//ITERATOR TO LOOP THE SET:
		Iterator i = set.iterator();
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey()+ " :" +me.getValue());
		}
		
		//CHECK GIVEN KEY EXIST OR NOT:
		System.out.println("Enter the key to check: ");
		String key = sc.nextLine();
		Set set1 = hm.entrySet();
		Iterator i1 = set1.iterator();
		while(i1.hasNext())
		{
			Map.Entry me1 =(Map.Entry) i1.next();
			if(me1.getKey().equals(key))
			{
				System.out.println("KEY FOUNDED");
				break;
			}
			else
			{
				System.out.println("KEY NOT FOUNDED");
			}
			
		}
		
		//CHECK GIVEN VALUE EXIST OR NOT:
				System.out.println("Enter the Value to check: ");
				String Value = sc.nextLine();
				Set set2 = hm.entrySet();
				Iterator i2 = set2.iterator();
				while(i2.hasNext())
				{
					Map.Entry me1 =(Map.Entry) i2.next();
					if(me1.getValue().equals(Value))
					{
						System.out.println("VALUE FOUNDED");
						break;
					}
					else
					{
						System.out.println("VALUE not FOUNDED");
					}
					
				}

	}

}
