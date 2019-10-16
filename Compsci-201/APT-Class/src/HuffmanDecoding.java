import java.util.ArrayList;
import java.util.Arrays;

public class HuffmanDecoding 
{
	 public String decode(String archive, String[] dictionary) 
	 {
		// for (String stri : dictionary)
		 {
		//	 archiver.add(stri);
		 }
		 
         String str ="";
         int j=0;
         
         for (int i=0; i<archive.length(); i++)
         {
        	 if( Arrays.asList(dictionary).indexOf(archive.substring(i, i+1)) != -1)
        			 {
        		 		str += Character.toString((char)(65 + Arrays.asList(dictionary).indexOf(archive.substring(i, i+1))));
        			 }
        	 
         }
         
         return str;
	 }

}
