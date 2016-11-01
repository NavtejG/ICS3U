/**
 * 
 */
package ghataure;

import java.util.Scanner;

/**
 *ICS3U
 *Divisableby7
 *is your number divisable by 7?
 *31/10/2016
 *Navtej Ghataure
 *
 *
 */
public class Divisableby7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	
		int integer;
		
		

		{
			System.out.print("Enter a integer:");
			integer=scan.nextInt();

		
			}

			if (integer % 7 != 0)
				System.out.print("This integer is not divisible by 7");
			else
				System.out.print("This integer is divisible by 7");
			

	}
}


