/**
 * 
 */
package ghataure;

import java.util.Scanner;

/**
 *ICS3U
 *Exercise1random
 *Random exercise
 *10/11/2016
 *Navtej Ghataure
 *
 */
public class Excerciserandom1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Name:");
		 String name=scan.nextLine();
		 
		 int x= (int)(Math.random()*100)+1;
		 
		if (x<=29)
			System.out.println("You hate that name");
		else if (x>=69)
			System.out.println("This is your favourite name.");				 

	}

}
