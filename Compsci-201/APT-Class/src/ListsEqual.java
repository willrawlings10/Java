
public class ListsEqual 
{
	public int equal (ListNode a1, ListNode a2)
	{
		int sum =0;
		int compare =0;
		
        while ((a1 != null) && (a2 !=null))
        {
        	
        	if (a1.info == a2.info)
        	{
        		sum++;
        	}
        	compare++;
        	a1 =a1.next;
        	a2 =a2.next;
        }
        
       if (a1 != a2)
       {
    	  return 0;
       }
     if (sum !=compare)
      {
    	 return 0;
      }
	  return 1;
    }
}
