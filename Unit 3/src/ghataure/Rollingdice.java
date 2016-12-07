/**
 * 
 */
package ghataure;

/**
 *ICS3U
 *Rollingdice
 *what numbers will you get?
 *06/12/2016
 *Navtej Ghataure
 *
 */
public class Rollingdice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		        int dice [] = new int[12]; 
		        for(int x = 0 ; x <10000; x++ ) {
		            ++dice  [(int)(Math.random()*11+1)];
		         
		          
		        }
		        System.out.println("Number           Number of times this happened" );  
		        for(int i = 0; 1 < dice.length ; i++) {

		        	System.out.println(i + "                  " + dice[i]);
		        }
		    }
		

	}


