/**
 * 
 */
package ghataure;

import java.util.Scanner;

/**
 *ICS3U
 *Average
 *01/11/2016
 *Finding your score
 *Navtej Ghataure
 *
 */
public class Average {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		
		int percentage;
		char grade;
		
		

		
			System.out.print("Enter your percentage:");
			percentage= scan.nextInt();

		
			

			if (percentage > 90){
				grade = 'A';
			}
			else if (percentage > 80){
				grade = 'B';
			}
			    		    
			  else if (percentage > 70){
				  grade = 'C';
			  }    
			  else if (percentage > 60 ){
				  grade = 'D';  
			  }
			  else {
				  grade = 'f';
			  } 
	
	
				System.out.println("The corresponding letter grade is:" + grade);
				

	}
}