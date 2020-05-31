package flowbasic;

import java.util.Scanner;

public class switch_month {

	/**
	 * @author muthu sundaram
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month_number = sc.nextInt();
		switch(month_number)
		{
		case 1:System.out.println("JANUARY");break;
		case 2:System.out.println("FEBRARY");break;
		case 3:System.out.println("MARCH");break;
		case 4:System.out.println("APRIL");break;
		case 5:System.out.println("MAY");break;
		case 6:System.out.println("JUNE");break;
		case 7:System.out.println("JULY");break;
		case 8:System.out.println("AUGUST");break;
		case 9:System.out.println("SEPTEMBER");break;
		case 10:System.out.println("OCTOBER");break;
		case 11:System.out.println("NOVEMBER");break;
		case 12:System.out.println("DECEMBER");break;
		default: System.out.println("INVALID MONTH NUMBER");
		
			
		}

	}

}
