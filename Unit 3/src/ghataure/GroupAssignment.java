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
		
		if (lastname.startsWith("A")||lastname.startsWith("B")||lastname.startsWith("C")||lastname.startsWith("D")||lastname.startsWith("E")||lastname.startsWith("F")||lastname.startsWith("G")||lastname.startsWith("H")||lastname.startsWith("I")) {
			System.out.println(firstName +  lastname + " is assigned to Group 1");
		} else if (lastname.startsWith("J")||lastname.startsWith("K")||lastname.startsWith("L")||lastname.startsWith("M")||lastname.startsWith("N")||lastname.startsWith("O")||lastname.startsWith("P")||lastname.startsWith("Q")||lastname.startsWith("R")||lastname.startsWith("S")) {
			System.out.println(firstName +  lastname + " is assigned to Group 2");
		} else { 
			System.out.println(firstName +  lastname + " is assigned to Group 3");

		}

	}




}


