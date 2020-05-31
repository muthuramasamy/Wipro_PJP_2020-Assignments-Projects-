package Fourwheeler_f;
import  Automobile_sample2.Vehicle;
public class Ford extends Vehicle {

	@Override
	public String getModelNumber() {
		return "FF-!24";
	}

	@Override
	public String getRegistrationNumber() {
		return "TN_32 V2030";
	}

	@Override
	public String getOwnerName() {
		
		return "MUTHU SUNDARAM T";
	}
	
	public int speed()
	{
		return 100;
	}
	public void Temperaturecont()
	{
		System.out.println("Air conditionar is on");
	}

}
