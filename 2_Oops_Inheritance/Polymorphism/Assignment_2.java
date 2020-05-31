package Polymorphism;
/**
 * 
 * @author MUTHUSUNDARAM_T
 *
 */
public class test_shapes {
	public static void main(String[] args)
	{
		shapes c = new shapes_circle();
		shapes t = new shapes_triangle();
		shapes s = new shapes_square();
		
		c.draw();
		c.erase();
		
		t.draw();
		t.erase();
		
		s.draw();
		s.erase();
	}

}
