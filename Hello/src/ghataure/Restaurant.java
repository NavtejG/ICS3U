/**
 * 
 */
package ghataure;

import java.util.Scanner;

/**
 *ICS3U
 * burgers
 *30/09/2016
 *Navtej Ghataure
 */
public class Restaurant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		double burgers;
		double fries;
		double sodas;
		double tax = 0.065;
		double t;
		double amount;

		
		burgers=1.69;
		fries=1.09;
		sodas=0.99;
		
		System.out.print("Enter the number of burgers:");
		burgers=scan.nextDouble();
		System.out.print("Enter the number of fries: ");
		fries=scan.nextDouble();
		System.out.print("Enter the number of sodas: ");
		sodas=scan.nextDouble();
		System.out.println("Total before tax: " +(burgers * 1.69 + fries * 1.09 + sodas * 0.99));
		t=(burgers * 1.69 + fries * 1.09 + sodas * 0.99);
		tax = 0.065;
		System.out.println("Total tax: " +(t*tax));
		tax = 1.065;
		System.out.println("Total after tax: " +(t*tax));
		System.out.print("Enter amount tendered:");
		amount=scan.nextDouble();
		System.out.print("Change: "+(amount - t*tax));
	}

}
