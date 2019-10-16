package javaConcepts;

import javax.swing.JOptionPane;
import java.util.Scanner;

//Chapter 2 - convert temperatures
public class TemperatureConversion_WillRawlings 
{

	double celsius;
	double kelvin;
	double fahrenheit; 
	Scanner in = new Scanner (System.in);

	public void convertFromFahrenheit()
	{
		//Convert the temperature from Fahrenheit to Celsius
		//Convert the temperature from Fahrenheit to Kelvin
		//Print a message to the console that shows the conversion
		
		System.out.print( "Enter a Fahrenheit Temperature: "); 
		double  fahrenheit= in.nextDouble();
		double celsius = (fahrenheit-32.0)*(5.0/9.0);
		double kelvin = (fahrenheit-32.0)*(5.0/9.0) + 273.15;
		System.out.println("C= " + celsius);
		System.out.println( "K= " + kelvin);
		
	

	}

	public void convertFromCelsius()
	{
		//Enter a prompt for the Celsius temperature in the console 
		//Convert the temperature from Celsius to Fahrenheit
		//Convert the temperature from Celsius to Kelvin
		//Print a message to the console that shows the conversion
		
		System.out.print( "Enter a Celsius Temperature: "); 
		double celsius= in.nextDouble();
		double fahrenheit = (9.0/5.0)*celsius + 32.0;
		double kelvin = celsius + 273.15;
		System.out.println("F= " + fahrenheit);
		System.out.println("K= " + kelvin);
	}
	
	public void convertFromKelvin()
	{
		//Enter a prompt for the Kelvin temperature in the console 
		//Convert the temperature from Kelvin to Fahrenheit
		//Convert the temperature from Kelvin to Celsius
		//Print a message to the console that shows the conversion
		System.out.print( "Enter a Kelvin Temperature: ");
		double kelvin= in.nextDouble();
		double celsius= kelvin - 273.15;
		double fahrenheit= (9.0/5.0)*celsius + 32.0;
		System.out.println("F= " + fahrenheit);
		System.out.println("C= " + celsius);


	}

}
