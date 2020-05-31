package Set;
/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;

public class Tree_set {
	static TreeSet<String> hs = new TreeSet<String>();
	
	public static void chkele(String name)
	{
		//C.Checks elemnts exist or not:
		Iterator itr = hs.iterator();
				while(itr.hasNext())
				{
					if( (itr.next()).equals(name));
					{
						System.out.println(name);
						break;
					}
				}
	}
	public static void iterele()
	{
		//B.ITERATION
		Iterator itr1 = hs.iterator();
				while(itr1.hasNext())
				{
					System.out.println( itr1.next());
				}
			
				
	}
	
	public void  rev()
	{	Iterator itr2 = hs.descendingIterator();
		while(itr2.hasNext())
		{
			System.out.println( itr2.next());
		}
	}
	public static void main(String[] args) {
		
		hs.add("Muthu");
		hs.add("Susi");
		hs.add("Susi");
		hs.add("Praveen");
		hs.add("Sound");
		Tree_set ts = new Tree_set();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check");
		String name = sc.nextLine();
		ts.chkele(name);
		System.out.println("The iterated elements in the list is : ");
		ts.iterele();
		System.out.println("The reverse set is :");
		ts.rev();
		
		

	}

}
