
public class ListCount
{
	 public int count (ListNode list)
	 {
       int sum =0;
       while (list != null)
    	   {
    	   sum++;
    	   list=list.next;
    	   }
	  return sum;
     }
}
