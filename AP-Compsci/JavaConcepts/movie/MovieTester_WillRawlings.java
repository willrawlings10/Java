package movie;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MovieTester_WillRawlings {

	public static void main(String[] args) 
	{
		ArrayList<Movie_WillRawlings> movies = new ArrayList<Movie_WillRawlings>();
		
		// Add at least 5 movies to the array list
		// Example: movies.add(new Movie("Gone with the Wind", "PG", 1940, 1.00, 10, 3));
		movies.add(new Movie_WillRawlings("IT", "R", 2017, 13,3));
		movies.add(new Movie_WillRawlings("Speed Racer", "PG", 2008, 23,21));
		movies.add(new Movie_WillRawlings("Moana", "PG", 2016, 56,6));
		movies.add(new Movie_WillRawlings("The HateFul Eight", "R",2016, 45,4));
		movies.add(new Movie_WillRawlings("Guardians of The Galaxy: Volume 2", "PG-13", 2017, 100,100));


		
		// Instantiate a MovieBox object and pass it the list of movies
		MovieBox_WillRawlings box = new MovieBox_WillRawlings(movies);
		
		// Instantiate an array list of the movies that have a certain rating
		ArrayList<Movie_WillRawlings> moviesByRating = new ArrayList<Movie_WillRawlings>();
		String rating =JOptionPane.showInputDialog("Enter the Movie Rating or enter ALL to see all movies: ");
		moviesByRating=box.findMoviesByRating(rating);


		// Loop through the array list of movies and print each movie's name, rating, and availability to the console.
		// Remember to use the accessor methods that you have created in the Movie class.
		for (int i=0; i<moviesByRating.size(); i++)
		{
			System.out.println( "The movie " + moviesByRating.get(i).getName()+ " has the rating of " + moviesByRating.get(i).getRating()+ " and there are " + moviesByRating.get(i).getTotalAvailable() + " copies available");
		}


	}

}
