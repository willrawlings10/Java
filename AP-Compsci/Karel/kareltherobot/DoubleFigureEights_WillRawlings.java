package kareltherobot;

import java.awt.Color;

public class DoubleFigureEights_WillRawlings implements Directions
{
	public static void main(String [] args)
	{
		World.setVisible(true);
		World.readWorld("doubleFigureEightsWorld.txt");
		World.showSpeedControl(true);
		//World.setBeeperColor(Color.RED);
		World.setWorldColor(Color.WHITE);
		
		UrRobot me = new UrRobot(5, 3, North, 0, Color.red);
		UrRobot you = new UrRobot(5, 8, North, 0, Color.blue);

       me.pickBeeper(); me.turnLeft(); me.move(); me.pickBeeper();
       you.pickBeeper(); you.turnLeft(); you.turnLeft(); you.turnLeft();
       you.move(); you.pickBeeper(); 
       me.turnLeft(); me.turnLeft(); me.turnLeft(); me.move(); me.pickBeeper();
       you.turnLeft(); you.move(); you.pickBeeper();
       me.move(); me.pickBeeper(); you.move(); you.pickBeeper();
       me.turnLeft(); me.turnLeft(); me.turnLeft(); me.move(); me.pickBeeper();
       you.turnLeft(); you.move(); you.pickBeeper(); 
       me.move(); me.pickBeeper(); you.move(); you.pickBeeper(); 
       me.turnLeft(); me.move(); me.pickBeeper();
       you.turnLeft(); you.turnLeft(); you.turnLeft(); you.move(); you.pickBeeper();
       me.move(); me.pickBeeper(); you.move(); you.pickBeeper(); 
       me.turnLeft(); me.move(); me.pickBeeper(); 
       you.turnLeft(); you.turnLeft(); you.turnLeft(); you.move(); you.pickBeeper(); 
       me.move(); me.pickBeeper(); you.move(); you.pickBeeper();         
       me.turnLeft(); me.move(); me.pickBeeper(); 
       you.turnLeft(); you.turnLeft();you.turnLeft(); you.move(); you.pickBeeper();
       me.move(); me.pickBeeper(); you.move(); you.pickBeeper(); 
       me.turnLeft();  me.move(); me.pickBeeper();
       you.turnLeft(); you.turnLeft(); you.turnLeft();  you.move(); you.pickBeeper();
       me.move(); me.pickBeeper();  you.move(); you.pickBeeper(); 
       me.turnLeft(); me.turnLeft();me.turnLeft();  me.move(); me.pickBeeper();
       you.turnLeft(); you.move(); you.pickBeeper();
	   me.move(); me.pickBeeper(); you.move(); you.pickBeeper();
	   me.turnLeft(); me.turnLeft(); me.turnLeft(); me.move(); me.pickBeeper();
	   you.turnLeft(); you.move(); you.pickBeeper();
	   me.turnLeft();   me.turnLeft();   me.turnLeft(); 
	   you.turnLeft();
	   me.turnOff();
	   you.turnOff();
	
	}
	
	
	

}
