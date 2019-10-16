package kareltherobot;

import java.awt.Color;

public class GardenerTester_WillRawlings implements Directions
{
	public static void main(String args[])  
	{

		World.setVisible(true);
		World.showSpeedControl(true);
		World.readWorld("gardenerWorld.txt");
		World.setSize(15, 15);

		Gardener_WillRawlings gardenerA = new Gardener_WillRawlings(2, 5, North, infinity) ;
		Gardener_WillRawlings gardenerB = new Gardener_WillRawlings(5, 9, West, infinity);
		Gardener_WillRawlings gardenerC = new Gardener_WillRawlings(6, 2, East, infinity);

		Supervisor_WillRawlings supergardener;
		supergardener = new Supervisor_WillRawlings (9, 6, South, infinity, gardenerA, gardenerB, gardenerC);
		
		
		
		supergardener.gardenTime();
		supergardener.superGarden();
	}
}


