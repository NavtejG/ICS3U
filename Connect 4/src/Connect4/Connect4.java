/**
 * 
 */
package Connect4;
import hsa_new.Console;
import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Connect 4.java
 * Who is going to get connect 4?
 * 23/01/2017
 * @author Navtej Ghataure
 */


public class Connect4 {
	

	public static void main1(String[] args){ 

	Scanner scan = new Scanner(System.in);
	}

	public static boolean putDisk(char[][] field, int column, char color) {
	
		if (field[0][column] != ' ')
			return false;

	
		for (int row = 0; row < 7; ++row) {


			if (field[row][column] != ' ') {
				// Put the disk on top of the current one.
				field[row-1][column] = color;
				return true;
			}
		}
	
	
		// If no other disks found, we place this disk at the bottom.
		field[6][column] = color;
		return true;
}


	// Check rows, if there are 4 or more disks of the same color - return winner color
	static char getWinnerInRows(char[][] field) {
	
		for (int row = 0; row < 7; ++row) {
			int count = 0;

			for (int column = 1; column < 7; ++column) {
				if (field[row][column] != ' ' &&
						field[row][column] == field[row][column-1])
					++count;
				else
					count = 1;

				// Check if there are 4 in a row.
				if (count >= 4) {
					// Return color of the winner
					return field[row][column];
				}
			}
		}

		return ' ';
	}


	static char getWinnerInColumns(char[][] field) {
		// Check rows and see if there are 4 chips/disks of the same color
		for (int column = 0; column < 7; ++column) {
			int count = 0;

			for (int row = 1; row < 7; ++row) {
				if (field[row][column] != ' ' &&
						field[row][column] == field[row-1][column])
					++count;
				else
					count = 1;

				// Check if there are 4 in a row.
				if (count >= 4) {
					// Return color of the winner
					return field[row][column];
				}
			}
		}

		return ' ';
	}


	static char getWinnerInDiagonals(char[][] field) {



		for (int column = 0; column < 7; ++column) {
			int count = 0;

			for (int row = 1; row < 7; ++row) {


				if (column + row >= 7) break;
				if (field[row][column+row] != ' ' &&
						field[row-1][column + row - 1] == field[row][column+row])
					++count;
				else
					count = 1;
				if (count >= 4) return field[row][column+row];
			}
		}


		for (int row = 0; row < 7; ++row) {
			int count = 0;


			for (int column = 1; column < 7; ++column) {


				if (column + row >= 7) break;
				if (field[row + column][column] != ' ' &&
						field[row+column - 1][column - 1] == field[row + column][column])
					++count;
				else
					count = 1;
				if (count >= 4) return field[row + column][column];
			}
		}



		for (int column = 0; column < 7; ++column) {
			int count = 0;

			// we did this for rows and columns
			for (int row = 1; row < 7; ++row) {


				if (column - row < 0) break;
				if (field[row][column-row] != ' ' &&
						field[row - 1][column - row + 1] == field[row][column-row])
					++count;
				else
					count = 1;
				if (count >= 4) return field[row][column-row];
			}
		}


		for (int row = 0; row < 7; ++row) {
			int count = 0;


			for (int column = 5; column >= 0; --column) {


				if (column - row < 0) break;
				if (field[column - row][column] != ' ' &&
						field[column - row - 1][column + 1] == field[column - row][column])
					++count;
				else
					count = 1;
				if (count >= 4) return field[column - row][column];
			}
		}

		// Otherwise return   character, which means nobody win in rows.
		return ' ';
	}

	public static char getWinner(char[][] field) {
		char winner = getWinnerInRows(field);
		if (winner != ' ') return winner;
		winner = getWinnerInColumns(field);
		if (winner != ' ') return winner;
		winner = getWinnerInDiagonals(field);
		if (winner != ' ') return winner;

		// Now we need to check if there are empty positions, otherwise it is a draw
		for (int i = 0; i < field.length; ++i)
			for (int j = 0; j < field[i].length; ++j)
				if (field[i][j] == ' ') return ' ';

		return 'D';
	}
	

	public static void printField(char[][] field) {
		for (int row = 0; row < 7; ++row) {
			System.out.print("| ");
			for (int col = 0; col < 7; ++col)
				System.out.print(field[row][col] + "| ");
			System.out.println();
		

		
		for (int col = 0; col < 7; ++col)
			System.out.print("---");
		System.out.println();
	}
	}

	public static void main11(String[] args) {
		Scanner input = new Scanner(System.in);

		char[][] field = new char[7][7];

		for (int i = 0; i < 7; ++i)
			for (int j = 0; j < 7; ++j)
				field[i][j] = ' ';

		printField(field);

		
		boolean isRed = true;
		while (true) {
			if (isRed)
				System.out.println("Red's turn");            
			else 
				System.out.println("Yellow's turn");
			System.out.print("Choose column (1-7) for a disk:");

			int column = input.nextInt();
			if (column < 1 || column > 7) {
				System.out.println("Column should be from 1 to 7");
				continue;
			}


			if (!putDisk(field, column - 1, isRed ? 'R' : 'Y')) {
				System.out.println("This column is filled! Choose another one.");
				continue;
			}

			printField(field);



			char result = getWinner(field);
			if (result == 'D') {
				System.out.println("It is a draw!");
				break;
			}
			else if (result == 'R') {
				System.out.println("Red win!");
				break;
			}
			else if (result == 'Y') {
				System.out.println("Yellow win!");
				break;
			}


			isRed = !isRed;
	}
  }

		}
	
