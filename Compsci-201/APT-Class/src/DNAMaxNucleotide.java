
public class DNAMaxNucleotide 
{
	
	      public String max(String[] strands, String nuc) 
	      {
	    	  
	    	  String longest= "";
	    	  int compareNucNumber=0;
	    	  int totalNucNumber=0;
	    	  int strandIndex=0;
	    	  String compareLetter="";
	    	  
	    	  for (int i=0; i<strands.length; i++)
	    	  {
	    		  for (int j=0; j<strands[i].length(); j++)
	    		  {
	    			  compareLetter = strands[i].substring(j,j+1);
	    			  if (compareLetter.equals(nuc))
	    			  {
	    				  totalNucNumber+=1;
	    			  }
	    			  
	    			  if (totalNucNumber > compareNucNumber)
	    			  {
	    				  compareNucNumber=totalNucNumber;
	    				  
	    				  strandIndex=i;
	    				  longest = strands[i];
	    			  }
	    			  if (totalNucNumber == compareNucNumber && totalNucNumber >0)
	    			  {
	    				  if (strands[strandIndex].length() < strands[i].length())
	    				  {
	    					  strandIndex =i;
	    					  longest = strands[i];
	    				  }
	    			  }
	    		  }
	    		  
	    		  totalNucNumber=0;
	    	  }
	    	  
	    	  
	    	  return longest;
	     
	      }
	   
}
