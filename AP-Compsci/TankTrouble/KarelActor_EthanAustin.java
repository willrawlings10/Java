package GridWorld;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class KarelActor_EthanAustin extends Actor
{
	Actor target = null;
	
	public KarelActor_EthanAustin()
	{
		
	}

	public KarelActor_EthanAustin(Actor targ)
	{
		target = targ;
	}
	
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
	
	public boolean canMove()
	{
		Location loc = getLocation();
		int direc = getDirection();
		Location adj = loc.getAdjacentLocation(direc);
		return getGrid().isValid(adj)&&!(getGrid().get(adj) instanceof Rock);
	}
	
	public void turnLeft()
	{
		setDirection(getDirection()-90);
	}
	
	public Color getColor()
	{
		return null;
	}
}
