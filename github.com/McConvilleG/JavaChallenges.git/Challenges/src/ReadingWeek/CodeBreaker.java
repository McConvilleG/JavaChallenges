/**
 * 
 */
package ReadingWeek;

import java.util.Arrays;

/**
 * Class will code string name: Charles Bukowski to ASCII value for each character
 * then decode an ASCII based char array to readable string
 * @author Gary
 *
 */
public class CodeBreaker {

	/**
	 * Will output string name to ASCII and has capability to decode ASCII 
	 * numeric value
	 * @param args
	 */
	public static void main(String[] args) {
		
		// challenge ... codify your name !
		String name = "Charles Bukowski"; 
		System.out.println("String to be coded ... "+name);
		int[] coded = code(name);
		System.out.println(Arrays.toString(coded)); 
		
		// uncoded
		char[] uncoded = decode(coded);
		System.out.println(Arrays.toString(uncoded));
		
	}//end of main
	
	/**
	 * Codes string array char by char into ASCII numeric value
	 * @param name
	 * @return
	 */
	public static int [] code (String name) {
		
		int[] coded = new int[name.length()];
		//code up
		for (int loop = 0; loop < name.length(); loop++) {
			coded[loop] = (int) name.charAt(loop);
		}
		return coded;
	}//end of code
	
	/**
	 * Decodes an ACSII based array to a readable char array
	 * @param coded (ASCII number based array)
	 * @return (Readable char array)
	 */
	public static char[] decode(int[] coded) {
		
		char[] uncoded = new char[coded.length];
		
		for (int loop = 0; loop < coded.length; loop++) {
			uncoded[loop] = (char) coded[loop];
		}
		return uncoded;
	}//end of decode

}//end of class
