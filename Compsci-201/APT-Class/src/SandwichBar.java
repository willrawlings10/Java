import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SandwichBar
{

  public int whichOrder(String[] available, String[] orders)
  {
	  int sandwichIndex=-1;
	  boolean isThere =false;
	  
	  
	  
	  for (int i=0; i< orders.length; i++)
	  {
		  String[]  orderSplit = orders[i].split(" ");
		  isThere= Arrays.asList(available).containsAll(Arrays.asList(orderSplit));
		  if (isThere==true)
		  {
			  sandwichIndex= i;
			  return sandwichIndex;
		  }
		  
	  }
	
	  return sandwichIndex;
}
}

	  
	  
	  
	  
	
