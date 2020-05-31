package Interface_Library;
/*
 * @author MUTHUSUNDARAM_T
 */
public class kid_User implements Library_user {

	@Override
	public void registerAccount(int age) {
		if(age<12)
		{
			System.out.println("You have successfully registered Under a kids account..!");
		}
		else
		{
			System.out.println("Sorry, Age must be 12 to register in kids section");
		}
		
	}

	@Override
	public void requestBook(String booktype) {
		if(booktype == "KIDS");
		{
			System.out.println("Book Issued successfully , please return it in 10 days");
		}
		
					
	}

}
