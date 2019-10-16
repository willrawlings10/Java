
public class ListLastFirst 
{
	public ListNode move(ListNode list) 
	{
		ListNode mover =list;
		
      if (list == null)
      {
    	  return null;
      }
      
      int compare=list.info;
      
      if (list.next == null)
      {
    	  return list;
      }
      
      while (list != null)
      {
    	  compare =list.info;
    	  list =list.next;
      }
      
      ListNode last = new ListNode(compare, mover);
      
      while (mover != null)
      {
    	  if (mover.next.next == null)
    	  {
    		  mover.next=null;
    		  break;
    	  }
    	  mover=mover.next;
    	  
      }
        return last;
    }
	
	 
  
}
