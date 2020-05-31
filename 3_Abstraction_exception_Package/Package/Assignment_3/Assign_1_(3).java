package automobile_package.four_wheeler;
/*@author muthu sundaram*/
import automobile_package.Vehicle;
public class Rollsroyce extends Vehicle {

	@Override
	public String getModelName() {
		String s = "RR-Phantom_8";
		return s;
	}

	@Override
	public String getRegistrationNumber() {
		String num = "TN-32 M999";
		return num;
	}

	@Override
	public String getOwnerName() {
		String name = "MUTHU SUNDARAM T";
		return name;
	}
	public int getspeed()
	{
		return 150;
	}
	public void tempradio()
	{
		System.out.println("The radio plays on..!");
	}

	

}
