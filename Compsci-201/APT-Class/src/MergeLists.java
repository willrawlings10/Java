
public class MergeLists 
{
	  public ListNode weave (ListNode a, ListNode b)
	  {
		  
		 ListNode merge =a;
		 
		 
		 int i=0;
		 while (a != null)
		 {
			 if (i%2==0)
			 {
				 a.next= new ListNode(b.info, a.next);
				 b=b.next;
				 
			 }
			 if (i%2 == 1)
			 {
				 a.next = new ListNode(a.info, a.next);
			 }
			 a= a.next;
			i++; 
		 }
		 
		 
		 
			
		 
		 
		  return merge;
	  }
}
