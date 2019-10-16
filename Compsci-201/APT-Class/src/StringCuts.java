import java.util.ArrayList;

public class StringCuts
{
	     public String[] filter(String[] list, int minLength)
	     {
	    	 ArrayList <String> minimum = new ArrayList<>();
	         for (String l : list)
	         {
	        	 if ((l.length() >= minLength )&& (! minimum.contains(l)))
	        	 {
	        		 minimum.add(l);
	        	 }
	         }
	         String[] mini = new String[minimum.size()];
	         int i=0;
	         for (String s : minimum)
	         {
	        	 mini[i] =s;
	        	 i++;
	         }
	         return mini;
	     }
	 
}
