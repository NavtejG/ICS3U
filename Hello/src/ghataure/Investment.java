/**
 * 
 */
package ghataure;

import java.util.Scanner;

/**
 *ICS3U
 *Investment
 *Calculate the how many years it will take?
 *14/11/2016
 *Navtej Ghataure
 *
 */
public class Investment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int iInvest = 2500;
		int finalInvest = 5000;
		double currentInvest = iInvest;
         
		double years = 1;
		
		while (currentInvest <= finalInvest){
		years = years + 1;
		currentInvest = currentInvest * 1.075;
		
		}
		System.out.println("It will take you "+  years + " years" );
	}

}
