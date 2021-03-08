package _05_netflix;

public class Netflix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie LOR = new Movie("Lord of the Rings", 10);
		Movie NannyMcPhee = new Movie ("Nanny McPhee", 9);
		Movie SOM = new Movie("Sound of Music", 10);
		Movie MaryPoppins = new Movie("Mary Poppins", 10);
		Movie SOR = new Movie("School of Rock", 8);
		LOR.getTicketPrice();
		NetflixQueue netflix = new NetflixQueue();
		netflix.addMovie(LOR);
		netflix.addMovie(NannyMcPhee);
		netflix.addMovie(SOM);
		netflix.addMovie(MaryPoppins);
		netflix.addMovie(SOR);
		netflix.printMovies();
		netflix.sortMoviesByRating();
		System.out.println("The best movie is " + netflix.getBestMovie());
		System.out.println("The second best movie is " + netflix.getMovie(1));
		
	}

}
