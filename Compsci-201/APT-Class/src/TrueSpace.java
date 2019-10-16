import java.util.ArrayList;

public class TrueSpace 
{
	 public long calculateSpace(int[] sizes, int clusterSize) 
	 {
		 ArrayList <Integer> sizeSansZero = new ArrayList <Integer>();
		 long ret = 0;
		 
		 for (int i=0; i<sizes.length; i++)
		 {
			 if (!(sizes[i]==0));
			 {
				 sizeSansZero.add(sizes[i]);
			 }
		 }
		
		 for (int j=0; j< sizeSansZero.size(); j++)
		 {
			 double num = (sizeSansZero.get(j) + clusterSize-1)/ (clusterSize);
			 ret = ret + (long) (num*clusterSize);
		 }
		 
		 
		
         return ret;
      }
}
