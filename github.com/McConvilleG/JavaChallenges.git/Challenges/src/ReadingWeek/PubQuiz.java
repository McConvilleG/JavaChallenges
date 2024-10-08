/**
 * 
 */
package ReadingWeek;

import java.util.Random;
import java.util.Scanner;

/**
 * Program for simple pub quiz
 * @author Gary
 *
 */
public class PubQuiz {

	/**
	 * Method to run simple pub quiz
	 * @param args
	 */
	public static void main(String[] args) {
		
		// scanner to get user input
		Scanner scanner = new Scanner(System.in);
		
		try {
			//declaring questions and answers
			String[] jokeQuestions = { "Largest planet ? ", "Worse song ever ? ", "Capital of Peru?","Roman god of War ?" };
			String[] jokeAnswers = { "Jupiter", "Castles in the Sky", "Lima","Mars" };
			
			// vars for the game
			Random random = new Random();
			String userAnswer;
			String anotherQuestion;
			
			System.out.println("General Knowledge quiz....");
			
			// wrapping the game in a loop
			do {
				// gets a random index value so the user gets a random question each time
				int questionIndex;
				questionIndex = random.nextInt(jokeQuestions.length);
				
				System.out.println("Your answer ...");
				userAnswer = scanner.nextLine();
				
				// checking the user answer against the expected answer
				if (userAnswer.equalsIgnoreCase(jokeAnswers[questionIndex])) {
					System.out.println("Well done !");
				} else {
					System.out.println("Not a bad guess but it was " + jokeAnswers[questionIndex]);
				}
				
				System.out.println("Another question (Y or N)..");
				anotherQuestion = scanner.nextLine();				
				
			}while (anotherQuestion.equalsIgnoreCase("Y"));
		} catch (Exception exception) {
			System.out.println("The quiz master had a problem ... run the game again.");
		} finally {
			scanner.close();
			System.out.println("Thanks for playing");
		}

	}//end of main

}//end of class
