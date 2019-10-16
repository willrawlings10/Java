import java.util.Arrays;

public class ListStretch
{
	 public ListNode stretch (ListNode list, int amount)
	 {
		 ListNode newList = list;
		 
		 if (list == null)
		 {
			 return null;
		 }
		 
		 while (list != null)
		 {
			 for (int i=1; i<amount; i++)
			 {
				 list.next = new ListNode(list.info, list.next);
			 }
			 for (int i=0; i<amount; i++)
			 {
				 list = list.next;
			 }
		 }
		return newList;
	 }
}
