package Automobile_sample2_test;

import Automobile_sample2.Vehicle;
import Fourwheeler_f.Ford;
import Fourwheeler_l.LAMBOGINI;
public class test_sample {
public static void main(String [] args)
{
	Ford f = new Ford();
	System.out.println(f.getModelNumber());
	System.out.println(f.getRegistrationNumber());
	System.out.println(f.getOwnerName());
	System.out.println(f.speed());
	f.Temperaturecont();
	
	System.out.println();
	
	LAMBOGINI la = new LAMBOGINI();
	System.out.println(la.getModelNumber());
	System.out.println(la.getRegistrationNumber());
	System.out.println(la.getOwnerName());
	System.out.println(la.speed());
	la.radiotep();
}
}
