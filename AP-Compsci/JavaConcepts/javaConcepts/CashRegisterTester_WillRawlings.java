package javaConcepts;
import java.util.ArrayList;
import java.text.*;   //Needed to format double numbers to 2 places

// This driver program should create a new Money object for each currency or coin
// in a cash register (from a penny to a twenty dollar bill).
// It should then initialize the cash register with some money and print out the 
// contents of the cash register.
//
public class CashRegisterTester_WillRawlings
{
	public static void main( String[] args )
	{
		DecimalFormat decFormat = new DecimalFormat("$0.00");

		// Set up all possible types of money from a penny to a twenty dollar bill - here are a few examples:
		Money_WillRawlings twentyDollars = new Money_WillRawlings("20 dollar bill",20.00);
		Money_WillRawlings tenDollars = new Money_WillRawlings("10 dollar bill",10.00);
		Money_WillRawlings fiveDollars = new Money_WillRawlings("5 dollar bill",5.00);
		Money_WillRawlings oneDollar = new Money_WillRawlings("1 dollar bill",1.00);
		Money_WillRawlings quarter = new Money_WillRawlings("quarter",0.25);
		Money_WillRawlings dime = new Money_WillRawlings("dime",0.10);
		Money_WillRawlings nickel = new Money_WillRawlings("nickel",0.05);
		Money_WillRawlings penny = new Money_WillRawlings("penny",0.01);

		// Initialize the cash register by sending it an array list of money (currency/coins)
		// You can set up a loop and populate the array list that way (possibly 10 of each currency or coin)

		ArrayList<Money_WillRawlings>  cash = new ArrayList<Money_WillRawlings>();  //This is the array list of money that needs to be populated
		for (int i=0; i<10;i++)
		{
			cash.add(twentyDollars);
			cash.add(tenDollars);
			cash.add(fiveDollars);
			cash.add(oneDollar);
			cash.add(quarter);
			cash.add(penny);
			cash.add(nickel);
			cash.add(dime);
		}




		CashRegister_WillRawlings register = new CashRegister_WillRawlings(cash);  //Instantiates the cash register with money.

		// Show what is in cash register
		System.out.println("\n"+"The cash register contains $"+register.getTotalMoneyInRegister()+" :");
		register.printAmountInRegister();	//Shows the amount of each currency
	}
}

