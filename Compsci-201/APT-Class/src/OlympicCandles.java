import java.util.Arrays;

public class OlympicCandles
{
	public int numberOfNights(int[] candles)
	{
	      int maxN = candles.length;
	      for (int k=0; k <maxN; k++)
	      {
	    	  Arrays.sort(candles);
	    	  int numToBurn = k+1;
	    	  
	    	  return numToBurn -1;
	      }
	      
	      return -1;
	   }
}
