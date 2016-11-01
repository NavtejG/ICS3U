/**
 * 
 */
package ghataure;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * ICS3U
 * Birthday
 *13/10/2016
 *Navtej Ghataure
 *
 */
public class Birthday {


	/**
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int number;
		int birthMonth;
		int birthDay;
		
		int january; 
		int febuary; 
	    int march;
		int april; 
		int  may;
	    int june;
		int july;
		int august;
		int september;
		int october;
	    int november;
	    int december;
	     
	    january=1; 
	    febuary=2; 
		march=3;
		april=4; 
	    may=5;
		june=6;
		july=7;
		august=8;
		september=9;
	    october=10;
	    november=11;
	    december=12;
	    
	    System.out.print("birthMonth: ");
	    birthMonth=scan.nextInt();
	    
	    System.out.print("birthDay: ");
	    birthDay=scan.nextInt();
	    
	    number=( birthDay+(5*(9+(4*(6+(birthMonth*5))))));
	    System.out.println("Your number is: " + number);
	    
	    System.out.println("Your Bithday is: " + birthMonth +"\\"+ birthDay);
			
		}
		
	
		
		
		
	


		
		
		

	}


