package javaConcepts;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.text.*;   //Needed to format double numbers to 2 places

// Create a CashRegister class that represents the cash register and its contents.  The CashRegister class 
// will keep track of the different currency and coins in the cash register.  You need a method to 
// tell you what money is in the cash register.
//
public class CashRegister_WillRawlings 
{
	private double penny;
	private double nickel;
	private double dime;
	private double quarter;
	private double dollar;
	private double five;
	private double ten;
	private double twenty;
	private double moneyReceived;
	private double purchaseAmount;
	// and the purchase amount 	

	private ArrayList<Money_WillRawlings> money = new ArrayList<Money_WillRawlings>(); // This keeps track of all the money in the register

	private DecimalFormat moneyFormat = new DecimalFormat("$0.00");  // Money format: 2 decimals with $
	private DecimalFormat decFormat = new DecimalFormat("#.##");     // Decimal format: 2 decimals
	
	public CashRegister_WillRawlings(ArrayList<Money_WillRawlings> startMoney)
	{
		money =startMoney;
		
		Collections.sort(money);
		Collections.reverse(money);
		
		// This is the constructor.  The array list parameter is full of Money objects.  Since the money 
		// needs to be separated, You will also need to sort the money array list in reverse order.
		
		




	}
	
	public double getTotalMoneyInRegister()
	{
		double sum=0;
		for (int i=0; i<money.size()-1;i++)
		{
			sum+=money.get(i).getValue();
		}
		
		return sum;


	}

	public void printAmountInRegister()
	{
		for (int i=0; i< money.size(); i++)
		{
			if (money.get(i).getValue()==20.00)
			{
				twenty+=20.00;
			}
			if (money.get(i).getValue()==10.00)
			{
				ten+=10.00;
			}
			if (money.get(i).getValue()==5.00)
			{
				five+=5.00;
			}
			if (money.get(i).getValue()==1.00)
			{
				dollar+=1.00;
			}
			if (money.get(i).getValue()==0.25)
			{
				quarter+=0.25;
			}
			if (money.get(i).getValue()==0.10)
			{
				dime+=0.10;
			}
			if (money.get(i).getValue()==0.05)
			{
				nickel+=0.05;
			}
			if (money.get(i).getValue()==0.01)
			{
				penny+=0.01;
			}
		}
		DecimalFormat currFormat = 
		        new DecimalFormat("$###,###.##");  
		DecimalFormat decFormat = 
		        new DecimalFormat("######.##");    
		double dimes = Double.valueOf(decFormat.format(dime));
		double nickels = Double.valueOf(decFormat.format(nickel));
		double pennys = Double.valueOf(decFormat.format(penny));

		String dimeFormat = currFormat.format(dimes);
		String nickelFormat = currFormat.format(nickels);
		String pennyFormat = currFormat.format(pennys);
		

		System.out.println(" 20 dollar bill amount: " + twenty);
		System.out.println(" 10 dollar bill amount: " + ten);
		System.out.println(" 5 dollar bill amount: " + five);
		System.out.println(" 1 dollar bill amount: " + dollar);
		System.out.println(" quarter amount: " + quarter);
		System.out.println(" dime amount: " + dimes);
		System.out.println(" nickel amount: " + nickels);
		System.out.println(" penny amount: " + pennys);
	}
	
	
}
