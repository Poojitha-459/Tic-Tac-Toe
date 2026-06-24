package com.tasks;

import java.util.Scanner;

public class Tic_Tac_TOE {

	static char[][] board = new char[3][3];
	static char currentPlayer = 'X';
	static Scanner sc = new Scanner(System.in);

	// Initialize board
	static void initBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '_';
			}
		}
	}

	// Display board
	static void displayBoard() {
		for (int i = 0; i < 3; i++) {
			System.out.println("--------------");
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println("--------------");
	}

	// Check winner
	static boolean checkWin() {
		// rows&column
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
				return true;

			if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)
				return true;
		}
//left&right diagonal
		if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
			return true;

		if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)
			return true;

		return false;
	}

	// Check draw
	static boolean isDraw() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (board[i][j] == '_')
					return false;

		return true;
	}

	// Make move
	static boolean makeMove(int pos) {
		if (pos < 1 || pos > 9) {
			System.out.println("Invalid! Enter 1-9");
			return false;
		}

		int row = (pos - 1) / 3;
		int col = (pos - 1) % 3;

		if (board[row][col] != '_') {
			System.out.println("Cell occupied! Choose another");
			return false;
		}

		board[row][col] = currentPlayer;
		return true;
	}

	public static void main(String[] args) {

		initBoard();

		System.out.println(" TIC-TAC-TOE GAME");
		System.out.println("Positions: 1 2 3\n 4 5 6\n 7 8 9\n");

		while (true) {
			displayBoard();
			System.out.print("Player " + currentPlayer + " (1-9): ");
			int pos = sc.nextInt();

			if (!makeMove(pos))
				continue;

			if (checkWin()) {
				displayBoard();
				System.out.println("Player " + currentPlayer + " WINS!");
				break;
			}

			if (isDraw()) {
				displayBoard();
				System.out.println("!! GAME DRAW!!");
				break;
			}

			currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
		}

		sc.close();
	}
}