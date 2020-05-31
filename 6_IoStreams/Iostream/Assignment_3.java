package IOstream;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;
public class count_words_in_file {

	/**
	 * @author Muthu Sundaram 
	 */
	public static int countoccurences(String[] a,String word)
	{
		int i=0;
		int count=0;
		for(i=0;i<a.length;i++)
		{
			word.equals(a[i]);
			count=count+1;
		}
		return count;
	}
	public static void main(String[] args)throws IOException {
		
		String inputFile = args[0];
		String OutputFile = args[1];
		String str1 = "";
		Scanner sc  = new Scanner(new File(inputFile));
		BufferedWriter br = new BufferedWriter(new FileWriter(OutputFile));
		
		while(sc.hasNextLine())
		{
			str1 = str1 + sc.hasNextLine();
			if(sc.hasNextLine())
			{
				str1 = str1+" ";
			}
		}
		String[] arr = str1.split(" ",90);
		Map<String,Integer> map = new HashMap<String,Integer>();
		for (int i=0;i<arr.length;i++)
		{
			int num = countoccurences(arr,arr[i]);
			map.put(arr[i], num);
		}
		TreeMap<String,Integer> sort = new TreeMap<String,Integer>();
		sort.putAll (map);
		for (Map.Entry<String,Integer> entry : sort.entrySet());
		{
			Entry<String, Integer> entry = null;
			br.write(entry.getKey() + " " + entry.getValue() +"\n");
		}
		br.close();
	}

}
