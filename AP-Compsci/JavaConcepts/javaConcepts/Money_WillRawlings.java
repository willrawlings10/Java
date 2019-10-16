package javaConcepts;
public class Money_WillRawlings implements Comparable
{
	private String type;	//type of currency
	private double value;	//value of money
	
	public Money_WillRawlings(String moneyType, double val)
	{
		type=moneyType;
		value=val;


	}
	
	public int compareTo(Object obj)
	{
		// Create a compareTo() method to determine how to compare a Money object.
		// Use the value of the money to determine whether it is less than, equal, or 
		// greater than the other money

		Money_WillRawlings other = (Money_WillRawlings) obj;
		if (other.getValue()==value)
		{
			return 0;
		}
		
		if (other.getValue()>value)
		{
			return -1;
		}
			return 1;
	




	}
	
	public boolean equals(Object obj)
	{
		Money_WillRawlings other = (Money_WillRawlings) obj;
		if (value == other.value)
			return true;
		return false;
	}
	
	public double getValue()
	{
		return value;


	}
	
	public String getType()
	{
		return type;


	}
	
	public String toString()
	{
		return ("Money Type: " + type + " is worth " + value);


	}
}
