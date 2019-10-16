package javaConcepts;

import javax.swing.JOptionPane;

// Prompt the user for first name, last name, street address, city, state, and zip code
// and print this information to the console in the format:
//       John Doe
//       110 Main Street
//       Hometown, NC 99999
//
public class PrintAddress_WillRawlings 
{
	public static void main (String[] args)
	{
		String firstName = JOptionPane.showInputDialog("What is your first name?");
		String lastName = JOptionPane.showInputDialog("What is your last name?");
		String address = JOptionPane.showInputDialog("What is your address?");
		String city = JOptionPane.showInputDialog("What is your city?");
		String state = JOptionPane.showInputDialog("What is your state?");
		String zipCode = JOptionPane.showInputDialog("What is your zip code?");
		
		System.out.println(firstName + " "+ lastName);
		System.out.println(address);
		System.out.println( city + ", " + state + " " + zipCode);
		

	}
}
