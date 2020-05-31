package Test_package_automobile;

import automobile_package.Vehicle;
import automobile_package.Two_wheeler.*;
import automobile_package.four_wheeler.*;

public class test {

	public static void main(String[] args) {
		two_whe_vehicle v = new two_whe_vehicle();
		System.out.println("Model Number : "+v.getModelName());
		System.out.println("Registration Number : "+v.getRegistrationNumber());
		System.out.println("Owner Name : "+v.getOwnerName());
		System.out.println("Speed : "+v.getspeed());
		v.radio();
		
		System.out.println();
		Rollsroyce rr = new Rollsroyce();
		System.out.println("Model Number : "+ rr .getModelName());
		System.out.println("Registration Number : "+rr.getRegistrationNumber());
		System.out.println("Owner Name : "+rr.getOwnerName());
		System.out.println("Speed : "+rr.getspeed());
		rr.tempradio();

	}

}
