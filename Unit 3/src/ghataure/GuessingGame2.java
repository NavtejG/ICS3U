/**
 * 
 */
package ghataure;

import java.util.Scanner;

/**
 * @author 323878314
 *
 */
public class GuessingGame2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int counter = 0;
		int number;
		int CorrectGuess = (int)(Math.random()*20)+1;
		while (counter <= 100){
		System.out.println("Enter a number between 1-20:");
		number=scan.nextInt();
		
		if (CorrectGuess == number)
System.out.println("You won!");

 if (number > CorrectGuess)
 System.out.println("Better luck next time.");

else 
System.out.println( "Computers number:"+ CorrectGuess);
System.out.println( "Players number:"+ number);


System.out.println("Try again?");
String again=scan.next();
if (again.equals("yes")){

}
else{ 
	counter = 100;

	}
	}
}
}