
import java.util.Arrays;
import java.util.Comparator;

public class Dirsort 
{
	public String[] sort(String[] dirs)
	{
       Arrays.sort(dirs, new DirComp());
       return dirs;
	}
	
	public class DirComp implements Comparator<String> 
	{
		
		@Override
		public int compare(String a, String b)
		{
			
		String[] arr = a.split("/");
		String[] brr = b.split("/");
		int difference = arr.length-brr.length;
		
		if (difference !=0)
		{
			return difference;
		}
		else
		{
			for (int i=0; i<arr.length; i++) 
			{
				int comp = arr[i].compareTo(brr[i]);
				if (comp !=0)
				{
					return comp;
				}
			}
			return 1;
		}
		
		}
		
	}

}

