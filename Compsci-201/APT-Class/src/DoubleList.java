
public class DoubleList 
{
	  public ListNode bigify(ListNode list) 
	  {
		  ListNode newList =list;
         if (list == null)
         {
        	 return null;
         }
         
         while (list != null)
         {

			 for (int i=1; i<2; i++)
			 {
				 list.next = new ListNode(list.info, list.next);
			 }
			 for (int i=0; i<2; i++)
			 {
				 list = list.next;
			 }
         }
         
         return newList;
         
      }
	  

}
