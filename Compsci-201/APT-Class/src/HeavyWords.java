import java.util.ArrayList;
import java.util.HashMap;

public class HeavyWords 
{
	public double average(String[] words)
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<String> dupe = new ArrayList <String>();
		String[] str = new String[words.length];
		for (int j=0; j<str.length; j++)
		{
			str[j]=words[j].substring(0,1);
		}
		for (int i=0; i<words.length;i++)
			{
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
		String front ="";
		for (int i=0; i<str.length;i++)
		{
			
			for (String s : str)
				{
					if (map.get(s) > count)
					{
						count = map.get(s);
						front = s;
					}
	  			}
	     }
		double average = 0;
		int counter = 0;
		for (int k=0; k<words.length;k++ )
		{
			if (words[k].substring(0,1).equals(front))
			{
				average += words[k].length();
				counter++;
			}
		}
		
		average = average/counter;
	
        return average;
    }
}
