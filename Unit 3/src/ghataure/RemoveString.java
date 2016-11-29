/**
 * 
 */
package ghataure;

import java.util.Scanner;

/**
 * @author 323878314
 *
 */
public class RemoveString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String sentence;
		String str;

		System.out.println("Enter a sentence:");
		sentence=scan.nextLine();
		System.out.println("Enter a string:");
		str=scan.nextLine();

		System.out.println(sentence.replace(str," "));
     

	}

}
