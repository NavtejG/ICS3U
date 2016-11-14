/**
 * 
 */
package ghataure;

import java.util.Scanner;

/**
 *ICS3U
 *Primefactor
 *whats your prime number?
 *14/11/2016
 *Navtej Ghataure
 *
 */
public class PrimeFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		double number;
		
		System.out.print("Enter a number:  " );
		number=scan.nextInt();
		
		int count = 2;
		
		while (count <= number){
			if(number % count ==0){
				System.out.println(count);
			number = number / count;
			}
			else{
				count = count +1;
				
			}
		}

	}

}
