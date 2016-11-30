/**
 * 
 */
package ghataure;

import java.util.Scanner;

/**
 * @author 323878314
 *
 */
public class CountVowels {

	/**
	 *ICS3U
	 *Count vowels
	 *30/11/2016
	 *Navtej Ghataure
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String sentence;
		int vowels = 0;
		String a;
		int i;
		System.out.println("Enter text:");
		sentence = scan.nextLine();

		for (i = 0; i < sentence.length(); i++){

			if (sentence.charAt(i) == 'a')
				vowels++;
			else if (sentence.charAt(i) == 'e')
				vowels++; 
			else if (sentence.charAt(i) == 'i')
				vowels++;
			else if (sentence.charAt(i) == 'o')
				vowels++;
			else if (sentence.charAt(i) == 'u')
				vowels++;

		}
		System.out.println("The number of vowels in " + (sentence) + " is " + vowels);



	}}


