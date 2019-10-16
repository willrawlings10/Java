package javaConcepts;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearch_WillRawlings
{
	private int[] numArray;
	

	public NumberSearch_WillRawlings(String[] list)	// What type of method is this?
	{
		numArray=new int[list.length];
		for (int i=0; i<numArray.length; i++)
		{
			numArray[i]= Integer.parseInt(list[i]);
			
		}


	}
	
	public void sortNumArray()
	{
		
		    for(int i=0; i< numArray.length-1; i++)
		    {
		           int min = i;       //min = location of lowest value 
		           for(int j = i+1; j< numArray.length; j++)
		           {
		                if(numArray[j] < numArray[min])
			        min = j;    //find location of lowest value
		           }
		           if( min != i) 
		           {
			     int temp = numArray[min];
			     numArray[min] = numArray[i];
			    numArray[i] = temp;   //put lowest value in pos i
		           }
		      }


	}

	public int getNextLargest(int searchNum)
	{
		// This method should search the array for the first number
		// that is greater than the search number.  If the search number is
		// greater than every number in the array, then return -1.
		// Hint: make sure that the array is sorted first.
			
		int value=0;
			sortNumArray();
			for (int i=0; i<numArray.length; i++)
			{
				if (numArray[i]> searchNum)
				{
					 value=numArray[i];
					break;
				}
				else
				{
					value= -1;
				}
				
				
			}

			return value;



	}

	public String toString()
	{
		String output= "";
		
		for (int i=0; i<numArray.length; i++)
		{	
			output+= numArray[i] + " ";
		}
		
		return output;
	}
}