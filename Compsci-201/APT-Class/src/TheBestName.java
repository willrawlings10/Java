import java.util.*;

public class TheBestName
{
	public String[] sort(String[] names) 
	{
        ArrayList<String> john = new ArrayList<>();
        ArrayList<String> noJohn = new ArrayList<>();
        for (String s: names)
        {
        	if (s.equals("JOHN"))
        	{
        		john.add(s);
        	}
        	else
        	{
        		noJohn.add(s);
        	}
        }
        String [] noJohnSort = sorter(noJohn);
        String[] altogether = new String[names.length];
        for(int k=0; k<john.size();k++)
        {
        	altogether[k] = john.get(k);
        	
        }
        for (int i=john.size(); i<noJohnSort.length;i++)
        {
        	altogether[i] = noJohnSort[i];
        }
        
        return altogether;
 }
	public String[] sorter (ArrayList<String> str)
	{
		TreeMap<String, Integer> map = new TreeMap();
        for (String s : str)
        {
        	
        	int weight=0;
        	for (int k=0; k<s.length();k++)
        	{
        		weight += s.substring(k,k+1).compareTo("A")+1;
        	}
       	 map.put(s,weight);
       	 
        }
        
        ArrayList<String> list = new ArrayList<>(map.keySet());
        Comparator<String> comp = Comparator.comparingInt(s -> map.get(s));
        Collections.sort(list, comp.reversed());
        return list.toArray(new String[0]);
	}
}
