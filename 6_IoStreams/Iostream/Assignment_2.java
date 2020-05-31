package IOstream;
import java.util.*;
import java.io.*;
public class copy_file {

	/**
	 * @author Muthu Sundaram Ramasamy�
	 */
	public static void main(String[] args)throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("Enter the Input File to be copied:");
		String fileone = br.readLine();
		System.out.println("Enter the Output file where the copied files to store:");
		String filetwo = br.readLine();
		
		FileReader f1_in = new FileReader(fileone);
		FileWriter f2_out = new FileWriter(filetwo);
		
		int i= f1_in.read();
		while(i!=-1)
		{
			System.out.write(i);
		}
		

	}

}

