/**
 * 
 */
package ghataure;

import java.util.Scanner;

/**
 *ICS3U
 *copyPrices
 *how many copies would you like?
 *01/11/2016
 *Navtej Ghataure
 *
 */
public class PrintingPrices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int copies;
		double price = 0.00;
		
		

		
			System.out.print("How many copies would you like?");
			copies=scan.nextInt();

		
			

			if (copies > 99)
			price = 0.30;
					
			else if (copies >499){
				price = 0.28;
			}
			    		    
			  else if (copies >749){
				  price = 0.27;
			  }    
			  else if (copies >1000){
			  price = 0.26;  		    
			  } 
				
			  else if (copies <1000){
			price = 0.25;
			
			  }
			
			System.out.println("Price per copy is:"+ price);
			System.out.println("Your total is:"+  (price*copies));
			  
			   
			

	}

}
