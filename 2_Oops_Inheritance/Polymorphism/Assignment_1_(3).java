package Polymorphism;
/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
public class orange extends Fruit {

	public orange(String name, String taste) {
		super(name, taste);
		this.taste= taste;
		
	}
	public void eat()
	{
		System.out.println("The name of the fruit is: "+ name);
		System.out.println("The taste of the fruit is: "+ taste);
	}

}
