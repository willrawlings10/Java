
public class RemoveLast 
{
	 public ListNode remove(ListNode list)
	 {
		 if ((list == null) || (list.next ==null))
		 {
			 return null;
		 }
		 
	         ListNode removeMinus = list;
	         ListNode looper =list;
	         int last = list.info;
	         while (list != null)
	         {
	        	 last = list.info;
	        	 list = list.next;
	         }
	         
	         while (looper != null)
	         {
	        	 if ((looper.next.info == last) && (looper.next.next == null))
	        	 {
	        		 looper.next = looper.next.next;
	        		 break;
	        	 }
	        	 looper =looper.next;
	         }
	     
	          return removeMinus;
	      
     }
}
