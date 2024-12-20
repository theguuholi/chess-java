package com.example.chess_java;

import com.example.chess_java.chess.ChessMatch;

public class ChessJavaApplication {

	public static void main(String[] args) {
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
