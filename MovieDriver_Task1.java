import java.util.Scanner;

public class MovieDriver_Task1 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Movie mv1 = new Movie();
		
		System.out.println("Enter the name of a movie");
		String title = keyboard.nextLine();
		mv1.setTitle(title);
		
		System.out.println("Enter the rating of the movie");
		String rating = keyboard.nextLine();
		mv1.setRating(rating);
		
		System.out.println("Enter the number of tickets sold for this movie");
		int ticketsSold = keyboard.nextInt();
		mv1.setSoldTickets(ticketsSold);
		
		mv1.toString();
		
		System.out.println("Goodbye");
		
		keyboard.close();
	}
}