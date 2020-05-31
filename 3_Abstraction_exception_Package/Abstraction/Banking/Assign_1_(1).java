package Abstraction;

public class Banking_options  {

	/**
	 * @author muthusundaram
	 */
	public static void main(String[] args) {
		Icici i = new Icici();
		KOTAKbank k = new KOTAKbank();
		Generalbank g = i;
		System.out.println("ICICI Bank : ");
		System.out.println("Savings Interest rate : "+g.getsavingsInterestrate());
		System.out.println("Fixed Deposit Interest rate : "+g.getfixeddepositInterestrate());
		
		g = k;
		System.out.println("Kotak Mahindra Bank : ");
		System.out.println("Savings Interest rate : "+g.getsavingsInterestrate());
		System.out.println("Fixed Deposit Interest rate : "+g.getfixeddepositInterestrate());
		
		
	}

}
