/**
 * 
 */
package ghataure;

/**
 *ICS3U
 *Exercise2random
 *Random exercise
 *10/11/2016
 *Navtej Ghataure
 *
 */
public class Exerciserandom2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
	int dice1= (int)(Math.random()*11)+2;
	int dice2= (int)(Math.random()*11)+2;

	if (dice1>dice2)
		System.out.println("User won!!!");
	else if (dice2>dice1)
		System.out.println("Computer won!!!");
	else if (dice2==dice1)
		System.out.println("It's a tie!!!");
		
	}

}
