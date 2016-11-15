/**
 * 
 */
package ghataure;

import java.util.Scanner;

/**
 *ICS3U
 *Dice2
 *What will you roll?
 *15/11/2016
 *Navtej Ghataure
 *
 */
public class Dice2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int counter = 0;
		while (counter < 2){
		int dice1= (int)(Math.random()*11)+2;
		int dice2= (int)(Math.random()*11)+2;

		if (dice1>dice2)
			System.out.println("User won!!!");
		else if (dice2>dice1)
			System.out.println("Computer won!!!");
		else if (dice2==dice1)
			System.out.println("It's a tie!!!");
		
	System.out.println("Would you maybe like to play again?");
	       String maybe=scan.next();
	       if (maybe.equals("yes")){
	       
		}
		else{ 
			counter = 2;
	

	}
	}
}
}
