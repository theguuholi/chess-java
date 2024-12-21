package com.example.chess_java;

import java.util.Scanner;

import com.example.chess_java.chess.ChessMatch;
import com.example.chess_java.chess.ChessPosition;

public class ChessJavaApplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(in);
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(in);
			chessMatch.performChessMove(source, target);
		}
	}

}
