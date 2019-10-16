import java.util.ArrayList;
import java.util.HashMap;

public class TentNames
{
	 public int popular(String[] tents)
	 {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<String> dupe = new ArrayList <String>();
		
		for (int i=0; i<tents.length;i++)
			{
				String[] str =tents[i].split(" ");
				for (String s : str)
					{
						if (map.containsKey(s))
						{
						map.put(s, map.get(s) + 1);
						}
		  				else 
		  				{
		  					map.put(s, 1);
		  				}
		  			}
		     }
		int count = 0;
		for (int i=0; i<tents.length;i++)
		{
			String[] str =tents[i].split(" ");
			for (String s : str)
				{
					if (map.get(s) > count)
					{
						count = map.get(s);
					}
	  			}
	     }
	
         return count;
     }
	
}
