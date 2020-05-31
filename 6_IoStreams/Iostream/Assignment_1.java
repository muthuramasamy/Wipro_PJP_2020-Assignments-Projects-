package IOstream;
import java.util.*;
import java.io.*;

public class io_stream {

	/**
	 * @author Muthu Sundaram Ramasamy
	 */
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Kindly Enter the file to be counted");
	    String filename = br.readLine();
		System.out.println("Enter the character to be counted");
		Character cha= Character.toLowerCase((char)br.read());
		
		FileReader fi = new FileReader(filename);
		int i = fi.read();
		int count = 0;
		while(i!=-1)
		{
			if(cha.equals(Character.toLowerCase((char)i)))
					{
				count = count+1;
					}
		}
		System.out.println("Filename name is:"+fi+ "and the character to be count is : " + cha 
				+"Finally the over all count f that character is :"+count);
	}

}
