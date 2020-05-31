package Encapsulation_Abstraction;
/**
 * @author MUTHUSUNDARAM_T
 */
public class Book {

	String name;
	double price;
	int qtystock;
	Author author;
	Book(String name,double price,int qtystock)
	{
		this.name= name;
		this.price= price;
		this.qtystock= qtystock;
	}
	
	//GETTER::
	public String getname()
	{
		return name;
	}
	public double price()
	{
		return price;
	}
	public int qtystock()
	{
		return qtystock;
	}
	
	//SETTER::
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setprice(double price)
	{
		this.price= price;
	}
	public void setqtystock(int qtystock)
	{
		this.qtystock=qtystock;
	}
	
	public static void main(String[] args) {
		Book o1 = new Book("Wings of Fire ", 250.54, 10000);
		System.out.println("Book name = " + o1.getname());
		System.out.println("Price = " + o1.price());
		System.out.println("Quantity = " + o1.qtystock());

	}

}
