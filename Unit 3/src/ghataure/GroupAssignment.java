/**
 * 
 */
package ghataure;

import java.util.Scanner;

/**
 * @author 323878314
 *
 */
public class GroupAssignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String firstName;
		String lastname;
		Scanner scan=new Scanner(System.in);



		System.out.print("Enter you first name: ");
		firstName = scan.nextLine();
		System.out.print("Enter you last name: ");
		lastname = scan.nextLine();
		
		if (lastname.startsWith("A-I")) {
			System.out.println(firstName + lastname + " is assigned to Group 1");
		} else if (lastname.startsWith("J-S")) {
			System.out.println(firstName + lastname + " is assigned to Group 2");
		} else {
			System.out.println(firstName + lastname + " is assigned to Group 3");

		}

	}




}


