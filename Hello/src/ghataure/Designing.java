/**
 * 
 */
package ghataure;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * ICS3U
 * Designing
 *12/10/2016
 *Navtej Ghataure
 *
 */
public class Designing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double designing;
		double coding;
		double debugging;
		double testing;
		double Time;

	
		
	
		
		System.out.print("How many hours do you spend designing:");
		designing=scan.nextDouble();
		System.out.print("How many hours do you spend coding: ");
		coding=scan.nextDouble();
		System.out.print("How many hours do you spend debuigging: ");
		debugging=scan.nextDouble();
		System.out.print("How many hours do you spend testing: ");
		testing=scan.nextDouble();
		System.out.format("\n");
		
		System.out.println("Designing:"+ designing);
		System.out.println("Coding:"+ coding);
		System.out.println("Debugging:"+ debugging);
		System.out.println("Testing:"+ testing);
		System.out.format("\n");
		
		Time = ( designing + coding + debugging + testing);
		
		System.out.print("Task\t\t % Time\n");
		System.out.println("Designing\t"+ (df.format (designing/Time*100)));
		System.out.println("Coding\t\t"+  (df.format  (coding/Time*100)));
		System.out.println("Debugging\t"+ (df.format (debugging/Time*100)));
		System.out.println("Testing\t\t"+ (df.format  (testing/Time*100)));
		
		
		


	}

}
