
/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Brandon Tran
*/

package esp;


import java.util.Scanner;

public class ESPGame {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int score = 0;

	        System.out.println("Welcome to the Color Guessing Game!");
	        System.out.println("Enter your name: ");
	        String name = scanner.nextLine();
	        
	        System.out.println("Enter your description: ");
	        String description= scanner.nextLine();
	        
	        
	        for (int round = 1; round <= 10; round++) {
	            System.out.println("\nRound " + round);
	            String targetColor = generateRandomColor();

	            boolean validChoice = false;
	            String userGuess;

	            do {
	                System.out.println("Guess the color red, green, blue, orange, pink, yellow");
	                userGuess = scanner.nextLine().toLowerCase();

	                if (userGuess.equals("red") || userGuess.equals("green") || userGuess.equals("blue") || userGuess.equals("orange") || userGuess.equals("yellow") || userGuess.equals("pink"))
	                	
	                		{
	                    validChoice = true;
	                } else {
	                    System.out.println("Invalid choice. Please choose  red , 'green, blue, orange, pink, yellow,");
	                }
	            } while (!validChoice);

	            if (userGuess.equals(targetColor)) {
	                System.out.println("Correct! You guessed the color correctly.");
	                score++;
	            } else {
	                System.out.println("Wrong! The correct color was " + targetColor + ".");
	            }
	        }

	        System.out.println("\nGame Over!");
	        System.out.println("Your final score is: " + score + " out of 10");
	        System.out.println("Username: " + name);
	        System.out.println("Description: " + description);
	  System.out.println("Due Date: 9/22/23");
	        scanner.close();
	    }

	    private static String generateRandomColor() {
	        int randomNumber = (int) (Math.random()*5);// Generates a random number between 0 and 2

	        switch (randomNumber) {
	            case 0:
	                return "red";
	            case 1:
	                return "green";
	            case 2:
	            	return "blue";
	            case 3:
	            	return "yellow";	           	
	            case 4:
	            	return "orange";
	            case 5:
	            	return "pink";
	            	
	            default:
	                return "";
	        }
	        
}
}