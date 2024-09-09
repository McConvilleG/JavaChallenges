/**
 * 
 */
package WeeklyChallenges;

import java.util.Scanner;

/**
 * Draws a user defined box shape on screen
 * @author Gary
 *
 */
public class SquareMeUpWeek4 {

	/**
	 * User is prompted for the size (length of side) for a box and the character
	 * to be used to build the box. This is then output to screen
	 * @param args
	 */
	public static void main(String[] args) {
		
		//declare vars
		char borderChar;
		int lengthSize;
		
		//get input from user
		Scanner scanner = new Scanner(System.in);
		//size of box
		System.out.println("Enter the length of side ");
		lengthSize = scanner.nextInt();
		
		//get char for border
		System.out.println("Enter the character to build the box with...");
		// grab the char (first element of the string)
		borderChar = scanner.next().charAt(0);
		
		//drawing top
		drawHorizontal(lengthSize, borderChar);
		//draw sides of box
		drawSides(lengthSize, borderChar);
		//draw bottom
		drawHorizontal(lengthSize, borderChar);
		
		//close resource
		scanner.close();		
		
	}//end of main
	
	/**
	 * 
	 * @param lengthSize
	 * @param borderChar
	 */
	public static void drawHorizontal(int lengthSize, char borderChar) {
		// drawing single line horizontal with the specified character
		for (int count = 1; count < lengthSize; count++) {
			// char with padding (of two spaces)
			System.out.print(borderChar + "  ");
		}
		// now draw the last character
		System.out.print(borderChar);
		System.out.println();
	}//end of drawHorizontal
	
	/**
	 * draws the sides. This will draw the left hand edge character then pad out a
	 * number of spaces until the right hand edge and then draw that character
	 * @param length
	 * @param borderChar
	 */
	public static void drawSides(int lengthSize, char borderChar) {
		for (int count = 1; count < lengthSize - 1; count++) { // each iteration represents a line of box
			// drawing left side - (tight to the left + two space pads)
			System.out.print(borderChar + "  "); // eg "* "
			// now pad out middle -
			for (int side = 1; side < lengthSize - 1; side++) { // if length is 4 then that's two of these " "
				System.out.print("   ");
			}
			
			// drawing right side - eg "*" because of last middle that's place the char to
			// the right (tight)
			System.out.print(borderChar);
			System.out.println();
		}
		
	}//end of drawSides

}//end of class
