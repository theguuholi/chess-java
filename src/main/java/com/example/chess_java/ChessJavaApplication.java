package com.example.chess_java;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.example.chess_java.chess.ChessException;
import com.example.chess_java.chess.ChessMatch;
import com.example.chess_java.chess.ChessPosition;

public class ChessJavaApplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		while (true) {
			try {
				UI.clearScreen();
				// UI.printBoard(chessMatch.getPieces());
				UI.printMatch(chessMatch);
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(in);


				boolean[][] possibleMovies = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMovies);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(in);
				chessMatch.performChessMove(source, target);
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				in.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				in.nextLine();
			}

		}
	}

}
