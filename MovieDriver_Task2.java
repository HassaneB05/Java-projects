import java.util.Scanner;

public class MovieDriver_Task2 {
	
public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		char cha;
		do {
		
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
		
		System.out.println(mv1.getTitle() + " (" + mv1.getRating() + "): Tickets Sold: " +
		                   mv1.getSoldTickets());
		
		keyboard.nextLine();
		
		System.out.println("Do you want to enter another? (y or n)");
		String character = keyboard.nextLine();
		cha = character.charAt(0);
		
		} while(cha == 'y');
		
		System.out.println("Goodbye");
		
		keyboard.close();
	}
}