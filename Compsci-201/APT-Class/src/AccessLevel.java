import java.util.ArrayList;

public class AccessLevel 
{
	public String canAccess(int[] rights, int minPermission)
	{
		  //ArrayList<String> access = new ArrayList<String>();
		String accessCodes = "";
		  
		  for (int i=0; i<rights.length;i++)
		  {
			  if (rights[i] >= minPermission)
			  {
				  accessCodes = accessCodes + "A";
			  }
			  else 
			  {
				  accessCodes = accessCodes + "D";
			  }
			  
		  }
		  
		  
		  
		  return accessCodes;
 }
}
