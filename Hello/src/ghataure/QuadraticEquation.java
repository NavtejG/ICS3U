/**
 * 
 */
package ghataure;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * ICS3U
 * Quadratic Equation
 *30/09/2016
 *Navtej Ghataure
 */
public class QuadraticEquation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a;
		int b;
		int c;
		
		   DecimalFormat df = new DecimalFormat ("0.00");
		
		System.out.println("Please enter 3 numbers:");
		
		a = scan.nextInt() ;
		b = scan.nextInt() ;
		c= scan.nextInt() ;
		
		System.out.println ("+ is = " +(df.format(-1*b+ Math.sqrt((Math.pow(b,2)-4*(a*c)))/2*a)));

		System.out.println("+ is = " +(df.format(-1*b- Math.sqrt((Math.pow(b,2) -4*(a*c)))/2*a)));

	}

}