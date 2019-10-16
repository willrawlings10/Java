import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class SortByFreqs 
{
	 public String[] sort(String[] data) 
	 {
         TreeMap<String, Integer> map = new TreeMap();
         for (String s : data)
         {
        	 map.putIfAbsent(s,0);
        	 map.put(s, map.get(s) + 1);
         }
         
         ArrayList<String> list = new ArrayList<>(map.keySet());
         Comparator<String> comp = Comparator.comparingInt(s -> map.get(s));
         Collections.sort(list, comp.reversed());
         return list.toArray(new String[0]);
     }
}
