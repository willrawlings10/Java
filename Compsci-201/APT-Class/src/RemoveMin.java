
public class RemoveMin 
{
	 public ListNode remove (ListNode list) 
	 {
		 ListNode newList = list;
		 ListNode first = list;
		 
        if (list == null || list.next == null)
        {
        	return null;
        }
        
        int compare = list.info;
        
        while (list != null)
        {
        	if (list.info < compare)
        	{
        		compare = list.info;
        	}
        	list =list.next;
        }
       
        if (first.info == compare)
        {
        	return first.next;
        }
        		
        while (first != null)
        {
        	if ((first.next.info == compare ))
        	{
        		first.next = first.next.next;
        		break;
        	}
        	
        	
        		first =first.next;
        
        }
       
    	   
        return newList;
     }
}
