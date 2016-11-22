/**
 * 
 */
package ghataure;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 323878314
 *
 */
public class ElaspsedTimecalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int hour  ;
		String time;
		int elapsed;
		double price = 0.00;
		
		

		   DecimalFormat df = new DecimalFormat ("0.00");
			
			System.out.print("Whats your starting hour?");
			hour = scan.nextInt();
			scan.nextLine();
			
			System.out.println("Am or Pm?");
			time = scan.nextLine();
			
			System.out.println("Numbers of ours elapsed?");
			elapsed = scan.nextInt();
			
			System.out.println("The time is:  " + (df.format(hour + elapsed) + time));

			
		
			

			  


		   }
		
	}


