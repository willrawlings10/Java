package movie;

import java.util.ArrayList;

// The MovieBox class represents a kiosk that stores movies.
public class MovieBox_WillRawlings 
{
	private ArrayList<Movie_WillRawlings> movies = new ArrayList<Movie_WillRawlings>();
	
	// Create a constructor method that accepts an array list of movies	
	public MovieBox_WillRawlings(ArrayList<Movie_WillRawlings> movieList)
	{
		movies=movieList;
	}
	
	// Create a method that accepts a rating and returns all of the movies that have that rating.
	// If the rating parameter is ALL then return all of the movies
	public ArrayList<Movie_WillRawlings> findMoviesByRating(String rating)
	{
		ArrayList<Movie_WillRawlings> movies2=new ArrayList<Movie_WillRawlings>();
		for (int i=0; i<movies.size(); i++)
		{
			
			if (rating.equals("ALL"))
			{
				movies2.add(movies.get(i));
			}
			if (rating.equals(movies.get(i).getRating()))
			{
				movies2.add(movies.get(i));
							}
		}

			return movies2;
	}
	
	
}
