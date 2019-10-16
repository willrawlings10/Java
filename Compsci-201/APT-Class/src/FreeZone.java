import java.util.ArrayList;

public class FreeZone 
{
	 public int[] uncovered(int zones, String[] covered)
	 {
		 ArrayList<Integer> parsed = new ArrayList<>();
		 ArrayList <Integer> compared = new ArrayList<>();
		 for (int j=0; j<zones;j++)
		 {
			 compared.add(j);
			 
		 }
		// System.out.println ("This is compare" + compared);
		 
		 
		 for (int i=0; i<covered.length;i++)
		 {
			String[] str = covered[i].split(" ");
			for (String s:str)
			{
				int temp = Integer.parseInt(s);
				parsed.add(temp);
			}	
		 }
		 
		// System.out.println ("This is the ranges:" + parsed);
		 
		int[] parsedArr =new int[parsed.size()];
		int f=0;
		for (int g :parsed)
		{
			parsedArr[f] = g;
			f++;
		}
	ArrayList<Integer> newComp = new ArrayList<>();
		
	for (int k=0; k<parsed.size();k+=2)
		 {
			for (int m=0; m<compared.size();m++)
			{
				if ((compared.get(m) < parsedArr[k]) && !(newComp.contains(compared.get(m))))
				{
					newComp.add(compared.get(m));
				}
					if ((compared.get(m) > parsedArr[k+1]) && !(newComp.contains(compared.get(m))))
					{
						newComp.add(compared.get(m));
					}
				
			
			//	System.out.println(" This is new Comp" +newComp);
			 }
		 }
	ArrayList <Integer> newNewComp = new ArrayList<>();
	for (int l=0; l<parsed.size();l+=2)
	 {
		for (int h=0; h<newComp.size();h++)
		{
			if ((newComp.get(h) < parsedArr[l]) && !(newNewComp.contains(compared.get(h))))
			{
				newNewComp.add(compared.get(h));
			}
				if ((newComp.get(h) > parsedArr[l+1]) && !(newNewComp.contains(compared.get(h))))
				{
					newNewComp.add(compared.get(h));
				}
			
		
		//	System.out.println(" This is new Comp" +newComp);
		 }
	 }
		 
	int[] parsedArray = new int[newNewComp.size()];
	int count =0;
	for (int i : newNewComp)
	{
		parsedArray[count] = i;
		count++;
	}
		 
		 return parsedArray;
	 }
}
