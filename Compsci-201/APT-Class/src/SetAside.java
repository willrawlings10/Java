import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SetAside
{
	  public String common(String[] list) 
	  {
		  HashMap<String, Integer> map = new HashMap<String, Integer>();
		  ArrayList<String> dupe = new ArrayList <String>();
	          for (int i=0; i<list.length;i++)
	          {
	        	  String[] str =list[i].split(" ");
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
	        	
	        	  for (int k=0; k<list.length;k++)
		          {
		        	  String[] stri =list[k].split(" ");
		        	  for (String s : stri)
		  			{
		  				if (map.get(s) == (list.length) && (! dupe.contains(s)))
		  				{
		  					dupe.add(s);
		  				}
		  				
		  			}
		          
		          }
	       Collections.sort(dupe);
	       String noDupe ="";
	       for (int i=0; i<dupe.size(); i++)
	       {
	    	   noDupe = noDupe + " " + dupe.get(i);
	       }
	      noDupe = noDupe.substring(1);
	          return noDupe;
	      
	  
}
}