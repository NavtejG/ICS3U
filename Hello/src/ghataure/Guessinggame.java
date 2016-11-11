/**
 * 
 */
package ghataure;

import java.util.Scanner;

/**
 *ICS3U
 *Guessinggame
 *Guess the right number
 *11/11/2016
 *Navtej Ghataure
 *
 */
public class Guessinggame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int number;
		int CorrectGuess = (int)(Math.random()*19)+2;
		System.out.println("Enter a number between 1-20:");
		number=scan.nextInt();
		
		if (CorrectGuess == number)
System.out.println("You won!");

 if (number > CorrectGuess)
 System.out.println("Better luck next time.");

else 
System.out.println( "Computers number:"+ CorrectGuess);
System.out.println( "Players number:"+ number);





	}

}
