package Polymorphism;
/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
public class test_fruit {
	public static void main(String[] args)
	{
		Fruit f = new Fruit("grapes","sweet");
		f = new apple("apple","salty");
		f.eat();
		f=new orange("orange","sweety");
		f.eat();
	}

}
