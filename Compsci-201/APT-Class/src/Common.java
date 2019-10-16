import java.util.ArrayList;
public class Common 
{
	public int count (String a, String b)
	{
       int compare=0;
      
       
      ArrayList <String> stringA = new ArrayList <String>();
      ArrayList <String> stringB = new ArrayList <String>();
      ArrayList <String> stringC = new ArrayList <String>();
      ArrayList <String> stringD = new ArrayList <String>();
       
       for (int i=0; i< a.length(); i++)
       {
    	   stringA.add(a.substring(i,i+1));
    	   stringB.add(b.substring(i,i+1));
       }
       for (int i=0; i<stringA.size(); i++)
       {
    	   stringC = noDuplicates(stringA);
    			   
       }
       for (int j=0; j<stringB.size(); j++)
       {
    	   stringD = noDuplicates(stringB);
    			   
       }
       
       for (int m=stringC.size()-1; m>=0;m--)
       {
    	   for (int n=stringD.size()-1; n>=0; n--)
    	   {
    		  if (stringC.get(m).equals(stringD.get(n)))
    		  {
    			  compare++;
    			 // stringA.remove(m);
    			  //stringB.remove(n);
    		  }
    	   }
       }
       
       
       return compare; 
     }
	



public ArrayList<String> noDuplicates(ArrayList <String> a)
{
	ArrayList <String> duplicate = new ArrayList <String>();
	
	for (int i=0; i<a.size(); i++)
	{
		if (! duplicate.contains(a.get(i)))
		{
			duplicate.add(a.get(i));
		}
	}
	
	return duplicate;
}

}