import java.util.HashMap;

public class BigWord
{

	public String most(String[] sentences)
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (String str : sentences)
		{
			String a = str.toLowerCase();
			String words [] = a.split(" ");
			for (String word : words)
			{
				if (map.containsKey(word))
				{
					map.put(word, map.get(word) + 1);
				}
				else 
				{
					map.put(word, 1);
				}
				System.out.println(word + " occured: " + map.get(word));
				
			}
		}
		int num=0;
		String bigWord = "";
		for  (int i=0; i<sentences.length;i++)
		{
			String str = sentences[i].toLowerCase();
			String words [] = str.split(" ");
			for (String word : words)
			{
				if (map.get(word) > num)
				{
					num = map.get(word);
					bigWord =word;
				}
			}
		}
        return bigWord;
    }
	/*public static void main (String [] args)
	{
		String [] a = {"This is the way", "This is the way", "this is this" };
		most(a);
	}*/
}


