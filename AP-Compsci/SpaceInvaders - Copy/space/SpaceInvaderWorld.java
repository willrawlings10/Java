package space;




import javax.swing.JOptionPane;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class SpaceInvaderWorld extends ActorWorld
{
	public SpaceShip ship;
	//private World<Actor> world;
	private BoundedGrid<Actor> gr;
	private int row = 1;
	private static int score;
	private int count;
	private int bulCount;
	
	public SpaceInvaderWorld(BoundedGrid<Actor> grid) 
	{
		super(grid);
		ship = new SpaceShip();
		gr = grid;
		//world = new World(gr);
		add(new Location(5,0), ship);
		
		for(int i=0; i<gr.getNumRows(); i++)
		{
			add(new Location(i, gr.getNumCols()-1),  new KarelActor_EthanAustin(ship));
		}
		
		
		score = 0;
		count = 1;      //used to count how many moves have been made to then add KarelActors when count%20==0
		bulCount = 0;   //used to limit the amount of times you can shoot, reduces spamming 
		
	}
	
	public boolean keyPressed(String description, Location loc)
	{
		//when user is removed, display GAME OVER and score
		if(ship.getGrid()==null)
		{
			JOptionPane.showMessageDialog(null, "GAME OVER\n"+"Your Score: "+score);
			return true;
		}
	
		//These if statements are for movement of the user, W=up, A=left, S=down, D=right
		//each if statment then checks for each of the following:
		//KarelActor in next location, count, score, and bulCount
		Location loca = ship.getLocation();
		if (description.equals("W")) 
		{
			Location next = loca.getAdjacentLocation(0);
			
			//to remove the user when next a KarelActor, so the user doesn't 'eat' a KarelActor
			if(gr.get(next) instanceof KarelActor_EthanAustin)
			{
				ship.removeSelfFromGrid();
				return true;
			}
			ship.moveTo(next);
			bulCount--;
			
			if(count%20 == 0)
			{
				//increase score and bring count back to 0
				score++;
				count = 0;
				//displays this information in the top yellow band of the game
				setMessage("Pres H for Help" + "\n" + "Score: " + score);
				//adds KarelActor to random row and last column
				add(new Location((int)(gr.getNumRows()*Math.random()), gr.getNumCols()-1), new KarelActor_EthanAustin(ship));
			}
			count++;
			return true;
		}
		if (description.equals("A")) 
		{
		
			Location next = loca.getAdjacentLocation(270);
			if(gr.get(next) instanceof KarelActor_EthanAustin)
			{
				ship.removeSelfFromGrid();
				return true;
			}
			bulCount--;
			ship.moveTo(next);
			if(count%20 == 0)
			{
				score++;
				count = 0;
				setMessage("Pres H for Help" + "\n" + "Score: " + score);
				add(new Location((int)(gr.getNumRows()*Math.random()), gr.getNumCols()-1), new KarelActor_EthanAustin(ship));
			}
			count++;
			return true;
		}
		if (description.equals("S")) 
		{
			
			Location next = loca.getAdjacentLocation(180);
			if(gr.get(next) instanceof KarelActor_EthanAustin)
			{
				ship.removeSelfFromGrid();
				return true;
			}
			bulCount--;
			ship.moveTo(next);
			if(count%20 == 0)
			{
				score++;
				count = 0;
				setMessage("Pres H for Help" + "\n" + "Score: " + score);
				add(new Location((int)(gr.getNumRows()*Math.random()), gr.getNumCols()-1), new KarelActor_EthanAustin(ship));
			}
			count++;
			return true;
		}
		if (description.equals("D")) 
		{
			
			Location next = loca.getAdjacentLocation(90);
			if(gr.get(next) instanceof KarelActor_EthanAustin)
			{
				ship.removeSelfFromGrid();
				return true;
			}
			ship.moveTo(next);
			bulCount--;
			if(count%5 == 0)
			{
				score++;
				count = 0;
				setMessage("Pres H for Help" + "\n" + "Score: " + score);
				add(new Location((int)(gr.getNumRows()*Math.random()), gr.getNumCols()-1), new KarelActor_EthanAustin(ship));
			}
			count++;
			return true;
		}
		//the help function
		if (description.equals("H") || description.equals("shift H"))
		{
			JOptionPane.showMessageDialog(null, "Press W,S,A,D to move your Mr. Smith and spacebar to fire tennis balls");
			return true;
		}
		//shooting method
		if (description.equals("SPACE")) 
		{
			//bulCount is reduced whenever it moves, so when it is less than or equal to 0, the user can shoot
			if(bulCount <= 0)
			{
				Location next = loca.getAdjacentLocation(90);
				RightBullet bul = new RightBullet();
				bul.putSelfInGrid(getGrid(), next);
				//bulCount is assigned to 2, so there is some time that you can't shoot
				bulCount = 2;
			}
			
			if(count%20 == 0)
			{
				score++;
				count = 0;
				add(new Location((int)(gr.getNumRows()*Math.random()), gr.getNumCols()-1), new KarelActor_EthanAustin(ship));
				setMessage("Pres H for Help" + "\n" + "Score: " + score);
			}
			count++;
			return true;
			
		}
		return false;
	}
	
	
	
	   public static void main(String[] args)
	   {
		   SpaceInvaderWorld world = new SpaceInvaderWorld(new BoundedGrid<Actor>(18,30));
		   world.setMessage("Pres H for Help" + "\n" + "Score: " + score);
		 
		   world.show();

	   }

}
