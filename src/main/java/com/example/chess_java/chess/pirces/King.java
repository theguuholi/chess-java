package com.example.chess_java.chess.pirces;

import com.example.chess_java.boardgame.Board;
import com.example.chess_java.chess.ChessPiece;
import com.example.chess_java.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

}
