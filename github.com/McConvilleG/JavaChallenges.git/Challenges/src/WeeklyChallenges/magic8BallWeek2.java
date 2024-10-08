/**
 * 
 */
package WeeklyChallenges;

import java.util.Random;
import java.util.Scanner;

/**
 * This class will prompt user to ask a question then randomly print out
 * one of eight given responses
 * @author Gary
 *
 */
public class magic8BallWeek2 {

	/**
	 * This method will output random response when asked question by user 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare vars
		int randomNumber;
		String question;
		
		// imported classes required - scanner for keyboard input &
		// Random for random number
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		// prompt user question
		System.out.println("What's your question?");
		question = scanner.nextLine();
		
		//close resource
		scanner.close();
		
		// get a random number between 1 - 8
		randomNumber = random.nextInt(8);
		randomNumber = randomNumber + 1;
		
		//adding 1 to the randomNumber - why ? well the random.nextInt(8)
		//gives a number between 0 - 7
		System.out.println("You want to know ...");
		System.out.println(question);
		
		// now give response
		switch (randomNumber) {
		case 1:
			System.out.println("As I see it, yes");
			break;
		case 2:
			System.out.println("Ask again later");
			break;
		case 3:
			System.out.println("Better not tell you now");
			break;
		case 4:
			System.out.println("Cannot predict now");
			break;
		case 5:
			System.out.println("Concentrate and ask again");
			break;
		case 6:
			System.out.println("Don't count on it");
			break;
		case 7:
			System.out.println("It is certain.");
			break;
		case 8:
			System.out.println("It is decidedly so.");
			break;
		default:
			System.out.println("I simply don't know !");
		
		}//end of switch		

	}//end of main

}//end of class
