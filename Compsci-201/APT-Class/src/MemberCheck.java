import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MemberCheck 
{
	 public String[] whosDishonest(String[] club1, 
             String[] club2, 
             String[] club3) 
	 {
		 String names = "";
		 
		 for (int i=0; i<club1.length; i++)
		 {
			 boolean member = ((Arrays.asList(club2).contains(club1[i])) || (Arrays.asList(club3).contains(club1[i])));
			 	if (member==true)
			 	{
			 		names = names + club1[i] + " ";
			 	}
		 }
		 
		 for (int j=0; j<club3.length; j++)
		 {
			 boolean member = (Arrays.asList(club2).contains(club3[j]));
			 	if (member==true)
			 	{
			 		names = names + club3[j] + " ";
			 	}
		 }
		 
		 String[] namesWDuplicates = names.split(" ");
		 ArrayList <String> noDup = new ArrayList <String>();
		 
		 for (String str : namesWDuplicates)
		 	{
			 	if (!(noDup.contains(str)))
			 	{
			 		if (! (str.equals("")))
			 			{
			 				noDup.add(str);
			 			}
			 	}
		 	}
		 String [] nameNoDup = new String[noDup.size()];
		 int k =0;
		for (String stri : noDup)
		{
			if (!(stri.equals(" ")))
				{
				nameNoDup[k] = stri;
				
				}
			k++;
				
		}
		Arrays.sort(nameNoDup);
		 return nameNoDup;
		 
	 }
}
