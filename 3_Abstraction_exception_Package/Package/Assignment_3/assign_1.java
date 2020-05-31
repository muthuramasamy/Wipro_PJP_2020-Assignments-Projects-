package automobile_package.Two_wheeler;

import automobile_package.Vehicle;
public class two_whe_vehicle extends Vehicle {

	@Override
	public String getModelName() {
		String s = "Pulsar120";
		return s;
	}

	@Override
	public String getRegistrationNumber() {
		String number = "TN-32 M1098";
		return number;
	}

	@Override
	public String getOwnerName() {
		String name = "MUTHU SUNDARAM";
		return name;
	}
	public int getspeed()
	{
		return 98;
	}
	public void radio()
	{
		System.out.println("The Radio is playing");
	}
}
