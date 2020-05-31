package array;

public class remove_dup {

	/**
	 * @author muthu sundaram
	 */
	public static void main(String[] args) {
		int [] array = {12,34,12,45,67,89};
		int [] arr2 = new int[array.length];
		
		for(int i=0 ; i< array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					array[j]=-1;
				}
			}
		}
		int j=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=-1)
			{
				arr2[j]=array[i];
				j++;
			}
		}
		for(int i=0;i<j;i++)
		{
			System.out.print(arr2[i]+ " " );
		}
	}

}
