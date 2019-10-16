package kareltherobot;
import kareltherobot.*;
import java.awt.Color;


public class DiamondPlanterDriver_WillRawlings implements Directions
{
	public static void main(String args[])  
	{
		World.setVisible(true);
		World.showSpeedControl(true);

	   	DiamondPlanter_WillRawlings dave = new DiamondPlanter_WillRawlings(2, 5, North, 4);
		dave.plantDiamond();
	    dave.setVisible(false);
	    dave.turnOff();
		
	    
	    DiamondPlanter_WillRawlings ray = new DiamondPlanter_WillRawlings(4, 3, North, 4);
		ray.plantDiamond();
	    ray.setVisible(false);
	    ray.turnOff();
	
	    DiamondPlanter_WillRawlings bill = new DiamondPlanter_WillRawlings(4, 7, North, 4);
		bill.plantDiamond();
	    bill.setVisible(false);
	    bill.turnOff();
	   
	    DiamondPlanter_WillRawlings murray = new DiamondPlanter_WillRawlings(6, 5, North, 4);
	    murray.plantDiamond();
	    murray.setVisible(false);
	    murray.turnOff();
	
}   
}

