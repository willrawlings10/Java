package space;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class KarelActor_EthanAustin extends Actor
{
//this class are the invaders and attack the user.
	Actor target = null;
	
	public KarelActor_EthanAustin()
	{
		
	}
//parameter of a target for which KarelActor chases down
	public KarelActor_EthanAustin(Actor targ)
	{
		target = targ;
	}
//the act method makes the KarelActor face its target and move towards it	
	public void act()
	{
		Location loc = getLocation();
		
		processTarget();
		if(target!=null)
		{
				face();
				move();
		}		
		else
		{
			move();
		}
		
	}
//this method chooses the first instance of the target in the grid
	public void processTarget()
	{
		if(target!=null)
		{
			if(target.getGrid() == null)
			{
				target = null;
			}
		}
		else
		{
			ArrayList<Actor> arr = getGrid().getNeighbors(getLocation());
			if(arr.size()!=0)
			{
				target = arr.get(0);
			}
		}
	}
//makes the KarelActor make its direction closest to that of the target
	public void face()
	{
		Location loc = getLocation();
		
		if(target!=null)
		{
			int targLoc = loc.getDirectionToward(target.getLocation());
			if(Math.abs(targLoc-getDirection())>45)
			{
				turnLeft();
			}
		}
		/*
		int direc = getDirection();
		int top = Math.abs(0-direc);
		int right = Math.abs(90-direc);
		int bot = Math.abs(180-direc);
		int left = Math.abs(270-direc);
		
		if(top<right&&top<bot&&top<left)
		{
			setDirection(0);
		}
		if(bot<right&&bot<left)
		{
			setDirection(180);
		}
		if(right<left)
		{
			setDirection(90);
		}
		else
		{
			setDirection(270);
		}*/
	}
//overrides Actor's move method to add the directionality of KarelActor correct
	public void move()
	{
		Location loc = getLocation();
		int direc = getDirection();
		Location adj = loc.getAdjacentLocation(direc);
		if(canMove())
		{
			moveTo(adj);
		}
		else
		{
			turnLeft();
		}
	}
//makes sure KarelActor	does not removeitself from grid
	public boolean canMove()
	{
		Location loc = getLocation();
		int direc = getDirection();
		Location adj = loc.getAdjacentLocation(direc);
		return getGrid().isValid(adj)&&!(getGrid().get(adj) instanceof Rock);
	}
//KarelActor can only turnLeft
	public void turnLeft()
	{
		setDirection(getDirection()-90);
	}
//Override the Actor's color	
	public Color getColor()
	{
		return null;
	}
}
