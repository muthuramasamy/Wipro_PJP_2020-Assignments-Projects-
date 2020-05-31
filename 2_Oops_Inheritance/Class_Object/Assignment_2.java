package Class;
/**
 * @author MUTHUSUNDARAM_T
 */
import java.util.*;
import java.io.*;
public class Box {
	int width = 0;
	int height = 0;
	int depth = 0;
	Box(int w,int h,int d)
	{
		this.width = w;
		this.depth = d;
		this.height=h;
	System.out.println("The volume is finded in the following manner : ");	
	}
	
	public int volume()
	{
		
		int vol = width*height*depth;
		return vol;
	}
	public static void main(String[] args)
	{
		Box b = new Box(2,4,3);
		int volume = b.volume();
		System.out.println("The Volume is " + volume);
	}
}
