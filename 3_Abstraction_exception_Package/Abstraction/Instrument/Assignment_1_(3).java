package Abstraction_Instrument;
import java.util.*;
import java.io.*;
public class Test_instrument {

	public static void main(String[] args) {
		Instrument [] insp = new Instrument[10];
		for(int i = 0;i<10;i++)
		{
			int x = (int)(Math.random()*3)+1;
			switch(x)
			{
			case 1:insp[i] = new piano();break;
			case 2:insp[i] = new Flute();break;
			case 3:insp[i] = new Guitar();break;
			}
		}
		for(int i =0 ;i<10;i++)
		{
			System.out.println(insp[i].play());
		}

	}

}
