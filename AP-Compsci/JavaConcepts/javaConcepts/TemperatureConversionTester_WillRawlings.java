package javaConcepts;

import javax.swing.JOptionPane;
import java.util.Scanner;

//Chapter 2 - convert temperatures
public class TemperatureConversionTester_WillRawlings 
{

	public static void main (String[] args)
	{
		TemperatureConversion_WillRawlings tempConv = new TemperatureConversion_WillRawlings();
		tempConv.convertFromFahrenheit();
		tempConv.convertFromCelsius();
		tempConv.convertFromKelvin();
	
	}
}
