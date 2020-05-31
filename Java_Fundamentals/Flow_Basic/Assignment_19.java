package flowbasic;

public class div_2_3_5 {

	/**
	 * @Author muthu sundaram
	 */
	public static void main(String[] args) {
		int counter = 0;
		int i=1;
		System.out.print("The divisible numbers are :");
		while (counter<5)
		{
			if( i%2==0 && i%3==0 && i%5==0)
			{
				
				System.out.print(i + " ");
				counter++;
			}
			++i;
		}
		

	}

}
