// Movie class:
// This assignment teaches you about OOP techniques.  Specifically, you will define constructors,
// instance variables, accessor methods, modifier methods, and the toString method.

package movie;

import static java.lang.System.*;

public class Movie_WillRawlings
{
	// Create private instance variables to store the information for a Movie
	private String movieTitle;
	private String rating;
	private int yearMade;
	private  int totalCopies;
	private int checkedOut;
	

	
	// Create a constructor with parameters: movie name, rating, year, total quantity, and checkout quantity
	public Movie_WillRawlings(String name, String rate, int year, int quantity, int checkout)
	{
		movieTitle=name;
		rating=rate;
		yearMade=year;
		totalCopies=quantity;
		checkedOut=checkout;

	}

	// Create modifier methods for each instance variable
	public void setName(String nam)
	{
		movieTitle=nam;
	}
	
	public void setRating(String rate)
	{
		rating=rate;
	}

	public void setYearMade(int yearProduced)
	{
		yearMade=yearProduced;
	}

	public void setTotal(int amount)
	{
		totalCopies=amount;
	}
	
	public void setCheckedOut(int checked)
	{
		checkedOut=checked;
	}
	
	// Create accessor methods for each instance variable
	public String getName()
	{
		return movieTitle;
	}

	public String getRating()
	{
		return rating;
	}
	
	public int getYearMade()
	{
		return yearMade;
	}
	
	public int getTotalCopies()
	{
		return totalCopies;
	}
	
	public int getCheckedOut()
	{
		return checkedOut;
	}
	// Create method to return the total number of copies that are available
	public int getTotalAvailable()
	{
		return (totalCopies-checkedOut);
	}

	// Create a toString() method to return the string version of the movie.
	public String toString()
	{
		return "The movie " + movieTitle + " has the rating of " + rating + " and there are " + getTotalAvailable() + " copies available";
	}
}