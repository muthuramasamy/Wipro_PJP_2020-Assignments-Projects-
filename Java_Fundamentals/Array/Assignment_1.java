package array;

public class sum_avg_array {

	/**
	 * @author Muthu sundaram
	 */
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int sum1=0;
		for(int i = 0;i<a.length;i++)
		{
			sum1=sum1+a[i];
			
		}
		int avg = sum1/a.length;
		System.out.println("THE sum and average is : "+ sum1 + " "+avg);

	}

}
