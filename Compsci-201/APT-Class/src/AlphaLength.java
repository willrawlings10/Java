import java.util.*;

public class AlphaLength 
{

	public ListNode create (String[] words) 
	{
		
		if (words.length ==0)
		{
			return null;
		}
		
		ArrayList<String> worder = new ArrayList<String>();
		for (int i=0; i<words.length; i++)
		{
			if (!worder.contains(words[i]))
			{
				worder.add(words[i]);
			}
		}
	Collections.sort(worder);
	
	
	ListNode first = new ListNode(worder.get(0).length(), null);
	ListNode last =first;
	for (int k=1; k< worder.size();k++)
	{
		last.next = new ListNode(worder.get(k).length(), null);
		last = last.next;
	}
	
	return first;
	
	}
	
}
