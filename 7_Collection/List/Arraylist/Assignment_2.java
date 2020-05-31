package List;

import java.util.*;
public class Array_list_printall_method {

	static ArrayList<String> al = new ArrayList<String>();
	public static void printall()
	{
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	public static void main(String[] args) {
		al.add("Hello");
		al.add("HI muthu");
		al.add("hello World");
		al.add("HI madam");
		printall();

	}

}
