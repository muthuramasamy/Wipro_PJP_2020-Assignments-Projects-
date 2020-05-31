package Abstraction_compartment_rail;

import java.util.*;
import java.io.*;

/**
 * 
 * @author T.MUTHU SUNDARAM
 *
 */
public class rail_compartments {
	public static void main(String[] args) {
		Compartment[] cmp = new Compartment[10];
		for(int i =0;i<10;i++)
		{
			int x = (int)(Math.random()*4)+1;
			switch(x)
			{
			case 1:cmp[i]=new first_compartment();break;
			case 2:cmp[i]=new ladies();break;
			case 3:cmp[i]=new luggage();break;
			case 4:cmp[i]=new General();break;
			}
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(cmp[i].notice());
		}

	}

}
