package Polymorphism;
/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
public class Fruit {

	String name ;
	String taste;
	int size;
	public Fruit(String name,String taste)
	{
		this .name=name;
		this.taste=taste;
	}
	public void eat() {
		System.out.println("The name of the fruit is: "+ name);
		System.out.println("The taste is sweet: "+taste);
	
		

	}}
