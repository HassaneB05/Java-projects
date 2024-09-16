/*
 * Class: CMSC203 
 * Instructor:Farnaz Eivazi
 * Description: The ESPGame class is a program that starts a game of guesses with the user.
 * Due: 09/15/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Hassane Bagayoko
*/
import java.util.Scanner;
import java.io.*;
import java.util.Random;


public class ESPGame {

	public static void main(String[] args) throws IOException {
		System.out.println("CMSC203 Assignement1: Test your ESP skills!");
		
		try (Scanner input = new Scanner(System.in)){
		System.out.println("Enter the filename: ");
		String filename = input.nextLine();
		
		try (Scanner inputFile = new Scanner(new File(filename))){
			
			System.out.println("There are sixteen colors from a file:");
			
			while (inputFile.hasNext()) {
				
				String color = inputFile.nextLine();
				System.out.println(color);
			}
			
			System.out.println();
			
			int programChoiceNumber;
			int correctGuess = 0;
			int roundCount = 0;
			Random randomChoice = new Random();
			
			for (int i = 1; i <=3; i++) {
				System.out.println("Round " + i + "\n");
				
				programChoiceNumber = randomChoice.nextInt(16) + 1;
				String programChoiceColor = "";
				switch (programChoiceNumber) {
				case 1:
					programChoiceColor = "Black";
					break;
				case 2:
					programChoiceColor = "White";
					break;
				case 3:
					programChoiceColor = "Gray";
					break;
				case 4:
					programChoiceColor = "Silver";
					break;
				case 5:
					programChoiceColor = "Maroon";
					break;
				case 6:
					programChoiceColor = "Red";
					break;
				case 7:
					programChoiceColor = "Purple";
					break;
				case 8:
					programChoiceColor = "Fuchsia";
					break;
				case 9:
					programChoiceColor = "Green";
					break;
				case 10:
					programChoiceColor = "Lime";
					break;
				case 11:
					programChoiceColor = "Olive";
					break;
				case 12:
					programChoiceColor = "Yellow";
					break;
				case 13:
					programChoiceColor = "Navy";
					break;
				case 14:
					programChoiceColor = "Blue";
					break;
				case 15:
					programChoiceColor = "Teal";
					break;
				case 16:
					programChoiceColor = "Aqua";
					break;
				default:
					System.out.println("Not a color.");
				}
				
				System.out.println("I am thinking of a color.");
				System.out.println("Is it one of list of colors above?");
				System.out.println("Enter your guess:");
				
				String playerColorChoice = input.nextLine();
				System.out.println();
				
				System.out.println("I was thinking of " + programChoiceColor + ".");
				
				if (programChoiceColor.equalsIgnoreCase(playerColorChoice))
					correctGuess++;
				roundCount++;
			}
			System.out.println("Game Over");
			System.out.println("You guessed " + correctGuess + "out of " + roundCount + "colors correctly.");
			
			System.out.println("Enter your name: ");
			String name = input.nextLine();
			System.out.println("Describe yourself: ");
			String description = input.nextLine();
			System.out.println("Due Date: ");
			String dueDate = input.nextLine();
		}
	}
  }
}
