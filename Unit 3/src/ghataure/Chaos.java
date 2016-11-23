/**
 * 
 */
package ghataure;

import java.util.Scanner;

/**
 * ICS3U
 *Chaos
 *so much chaos :D
 *23/11/2016
 *Navtej Ghataure
 *
 */
public class Chaos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	

		System.out.println("Please enter a number for x:");
		int x=scan.nextInt();
		for(int i = 0; i<50;i++){
			x = 2*x*(1-x);	
			//System.out.println(x= 2*x*(1-x));
			System.out.println(x);
       
		} 

	}

}

