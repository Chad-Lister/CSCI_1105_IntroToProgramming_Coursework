/*
Author: Chad Lister
Date:  03/09/2020

	(Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns marking an available cell in a 3 * 3 grid with their respective tokens (either X or O). Create a program for playing tic-tac-toe. The program prompts two players to enter an X token and O token alternately. Whenever a token is entered, the program redisplays the current board. If the position is already occupied, the program will print an error and re-prompt the user. You do not need to write the portion of code that determines end of game or winner; simply end the game when all spots are full.

	Here is a sample run. Your display does not need to look exactly like this.

	(Hint: Create an array of Strings where each element is initialized as " ". This will help organize your game output.)
	
	
*/

import java.util.Scanner;

class Exercise_8_9 {
	public static void main(String[] args) {
		
		String [][] board = {
			{" ", " ", " "},
			{" ", " ", " "},
			{" ", " ", " "},
		};
		
		
		//  1st move.  Always X.
		String player = "X";
		displayBoard(board, player);		
		
		
		//  Main program loop.  8 moves total: 4 each.  
		for (int moves = 0; moves < 4; moves++) {
			
			//  Do player # 2 which is O.
			player = "O";
			displayBoard(board, player);
			
			// Do  player # 1 which is X.
			player = "X";
			displayBoard(board, player);
			
		}
		
		//  Display Ending Board.
		System.out.println(" -------------");
		
		for (int r = 0; r < 3; r++) {
			System.out.print(" | ");
			for (int c = 0; c < 3; c++) {
				System.out.print(board[r][c]);
				System.out.print(" | ");	
			}
			System.out.println();
			System.out.println(" -------------");
			
		}		
	}
	
	//  Main loop for display and player input.
	public static String [][] displayBoard(String[][] board, String player) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.println(" -------------");
		
		for (int r = 0; r < 3; r++) {
			System.out.print(" | ");
			for (int c = 0; c < 3; c++) {
				System.out.print(board[r][c]);
				System.out.print(" | ");	
			}
			System.out.println();
			System.out.println(" -------------");
			
		}
		
		System.out.print("Enter a row (0, 1, or 2) for player " + player + ":  ");
		int row = input.nextInt();
		System.out.print("Enter a column (0, 1, or 2) for player " + player + ":  ");
		int column = input.nextInt();
		
		//  Check for valid move.  Square isn't occupied.
		if (isValid(row, column, board) == true) {
			
			//  If it's valid then process.
			processMove(player, row, column, board);
		}
		
		//  Otherwise re-display and re-prompt for given player.
		else {
			displayBoard(board, player);
		}
				
		return board;
	}
	
	//  Method assumes it is an okay move unless not blank.
	public static Boolean isValid(int row, int column, String [][] board) {
		
		boolean valid = true;
		
		if (board[row][column] != " ") {
			
			System.out.println();
			System.out.println("Invalid move!!!!!");
			valid = false;
			
		}
		return valid;
		
	}
	
	//  Method to load the square with an "X" or "Y".	
	public static String[][] processMove(String player, int row, int column, String[][] board){
				
		board[row][column] = player;
		return board;
	}
}