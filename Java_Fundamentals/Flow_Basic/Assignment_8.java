package flowbasic;

import java.util.Scanner;

public class swtich_color {


	/**
	 * @Author Muthu sundaram
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char color = sc.next().charAt(0);
		switch(color)
		{
		case 'R':
		{
			System.out.println("RED");
			break;
		}
		case 'Y':
			System.out.println("YELLOW");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'V':
			System.out.println("Violet");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		default:
			System.out.println("Invalid CAse");
		}

	}

}
