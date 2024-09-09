/**
 * 
 */
package ReadingWeek;

/**
 * Prints number 1-100. For multiples of 3, will print 'Fizz', for multiples
 * of 5, will print 'Buzz' and for mulitples of 3 & 5, will print Fizz Buzz
 * @author Gary
 *
 */
public class FizzBuzz {
	
	//constants for keyword outputs
	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";

	/**
	 * Method will output numbers 1-100; however, for multiples of 3, number will be replaced 
	 * with 'Fizz'. Multiples of 5 will be replaced with 'Buzz'. Multiples of 3 and 5 replaced with
	 * 'Fizz Buzz'
	 * @param args
	 */
	public static void main(String[] args) {
		
		int limit = 100;
		
		// loop for 100 times
		for (int loop=1; loop<=limit; loop++) {
			if (loop%15==0) {
				System.out.print(FIZZ+BUZZ+" ");
			} else if (loop%5==0)  {
				// number divisible by 5, print 'Buzz'
				//in place of number
				System.out.print(BUZZ+" ");
			} else if (loop%3==0)  {
				// number divisible by 3, print 'Fizz'
				//in place of number
				System.out.print(FIZZ+" ");
			} else  { 
				// print the numbers
				System.out.print(loop+" ");
			}			
			
		}

	}//end of main

}//end of class
