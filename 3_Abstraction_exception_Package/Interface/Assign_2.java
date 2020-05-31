package Interface_Library;
/*
 * @author MUTHUSUNDARAM_T
 */
import java.util.Scanner;

import Interface_Library.*;
public class test_interface {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String booktype = sc.nextLine();
		kid_User kid = new kid_User();
		Adult_user adu = new Adult_user();
		kid.registerAccount(age);
		kid.requestBook(booktype);
		System.out.println();
		adu.requestBook(booktype);
		adu.registerAccount(age);
	}

}
