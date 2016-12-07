/**
 * 
 */
package ghataure;

import java.util.Scanner;

/**
 * @author 323878314
 *
 */
public class Listofnames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			int name;
			String namesv2;
			
			System.out.print("How many names would you like?:");
			name = scan.nextInt();
			
			String names[] = new String[name];
			
			System.out.println("Enter all the names:");
			for(int i = 0; i < name; i++)
			{
				names[i] = scan.nextLine();
			}
			for (int i = 0; i < name; i++) 
			{
				for (int a = i + 1; a < name; a++) 
				{
					if (names[i].compareTo(names[a])>0) 
					{
						namesv2 = names[i];
						names[i] = names[a];
						names[a] = namesv2;
					}
				}
			}
			System.out.println("Your names in order are:");
			for (int i = 0; i < name - 1; i++) 
			{
				System.out.println(names[i]);
			}
			System.out.println(names[name - 1]);
		
	
	
	for (int i = 0; i < name - 1; i++) 
	{
		System.out.println(names[i]);
	}

	System.out.println("Your names in reverse order are:");
	for (int i = 0; i < name - 1; i--) 
	{
		System.out.println(names[i]);
	}
	System.out.println(names[name - 1]);



for (int i = 0; i < name - 1; i--) 
{
System.out.println(names[i]);

}
}

}



