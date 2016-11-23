/**
 * 
 */
package ghataure;

/**
 *ICS3U
 *PowersTable
 *do you know your powers?
 *11/11/2016
 *Navtej Ghataure
 *
 */
import java.util.Scanner;
public class Powerstable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 
		System.out.format("%5s%5s%5s%5s%5s%1s","X^1","X^2","X^3","X^4","X^5","X^6");
		for (int i = 1; 1<=6;i++){
	    System.out.format("%5s%5s%5s%5s%5s%1s",(int)Math.pow(i,1),(int)Math.pow(i,2),(int)Math.pow(i,3),(int)Math.pow(i,4),(int)Math.pow(i,5),"\n\n");
	}

}
}