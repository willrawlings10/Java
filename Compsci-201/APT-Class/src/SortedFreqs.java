import java.util.*;

public class SortedFreqs
{
	public int[] freqs(String[] data) 
	{
		 Arrays.sort(data);
		 TreeMap<String, Integer> map = new TreeMap();
         for (String s : data)
         {
        	 map.putIfAbsent(s,0);
        	 map.put(s, map.get(s) + 1);
         }
         ArrayList<String> str = new ArrayList<>();
         int[] values = new int[data.length];
         ArrayList<Integer> valuesZero = new ArrayList<>();
         int count=0;
         for (String s : data)
         {
        	 if (! str.contains(s))
        	 {
        		 values[count] = map.get(s);
        		 str.add(s);
        		 count++;
        	 }
        	 
        	 
         }
        
         for (int inte : values)
         {
        	 if (inte != 0)
        	 {
        		 valuesZero.add(inte);
        	 }
         }
         
        int[] values2 = new int[valuesZero.size()];
        for (int j=0; j<values2.length; j++)
        {
        	values2[j] = valuesZero.get(j);
        }
         
         return values2;
	}
}
