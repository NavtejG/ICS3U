/**
 * 
 */
package ghataure;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *ICS3U
 *Time
 *What is the time?
 *23/11/2016
 *Navtej Ghataure
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
		double t2 = 0.00;



		DecimalFormat df = new DecimalFormat ("0.00");

		System.out.print("Whats your starting hour?");
		hour = scan.nextInt();
		scan.nextLine();



		System.out.println("Numbers of ours elapsed?");
		elapsed = scan.nextInt();
		if (hour+elapsed >=12){
			System.out.print("Your time is:" +(hour + elapsed - 12) + "Pm");
		}
		else if(hour + elapsed <=12){
			System.out.println("Your time is:" + (hour + elapsed + 12) + "Am");
		}



	}
}

	


