/**
 * 
 */
package WeeklyChallenges;

import java.util.Scanner;

/**
 * ASCII to text converter
 * @author Gary
 *
 */
public class ASCIIConverterWeek3 {
	
	// using a constant here!
	public static final int SPACE_CHAR = 32;

	/**
	 * Start point for app... ASCII to text converter. Takes user input to 
	 * translate text to ASCII and other display conversions
	 * @param args
	 */
	public static void main(String[] args) {
		
		//decalre vars
		int userOption;
		String usersName, charToASCIIInput;
		
		//set up scanner
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			//display menu
			System.out.println("ASCII Convertor Menu................");
			System.out.println("1. Show ASCII Table");
			System.out.println("2. Convert a Character to ASCII");
			System.out.println("3. Convert your name to ASCII");
			System.out.println("4. Quit");
			
			System.out.println("Enter a number and return");
			
			// get a user's option
			userOption = scanner.nextInt();
			scanner.nextLine(); // this clears out the return character (nextInt takes just the int entered)
			
			// process that option
			switch (userOption) {
			case 1:
				System.out.println("ASCII Table ...");
				// starting at 32 - first meaningful char (SPACE_CHAR)
				for (int loop = 32; loop < 128; loop++) {
					System.out.println(loop + "\t  " + (char) loop);
				}
				break;
			case 2: 
				System.out.println("Enter character to see the ASCII value");
				charToASCIIInput = scanner.next();
				// now get the first char
				char character = charToASCIIInput.charAt(0);
				System.out.println(character + "\t \t " + (int) character);
				break;
			case 3:
				System.out.println("Enter your name ");
				usersName = scanner.nextLine();
				
				System.out.println("ASCII \t");
				for (int loop = 0; loop < usersName.length(); loop++) {
					// ignoring any the space characters
					if ((int) usersName.charAt(loop) != SPACE_CHAR) {
						System.out.print((int) usersName.charAt(loop) +"\t" + usersName.charAt(loop) + "\n");
					}
				}
			case 4: 
				System.out.println("Exit");
				break;
			default:
				System.out.println("Sorry try that again ...");
			}
			
			// end point of loop
		} while (userOption!=4);
		System.out.println("Bye ...");
		
		//close resource
		scanner.close();

	}//end of main

}//end of class
