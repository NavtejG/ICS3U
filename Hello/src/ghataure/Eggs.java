/**
 * 
 */
package ghataure;

import java.util.Scanner;

/**
 *ICS3U
 *Eggs
 *01/11/2016
 *Navtej Ghataure
 *
 */
public class Eggs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int dozen;
		double price = 0.00;
		
		

		
			System.out.print("How many dozens would you like?");
			dozen= scan.nextInt();

		
			

			if (dozen > 4){
			price = 0.50;
			}
			else if (dozen > 6){
				price = 0.45;
			}
			    		    
			  else if (dozen > 11){
				  price = 0.40;
			  }    
			  else if (dozen < 11 ){
			  price = 0.35;  		    
			  } 
	
	
				System.out.println("price per dozen:" + price);
				System.out.println("Your total is:"+  (price*dozen));
				System.out.print("The amount of eggs your purchases are:" + dozen*12);
			  
			   
	}
	}

