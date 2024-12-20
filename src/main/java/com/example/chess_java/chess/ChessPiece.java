package com.example.chess_java.chess;

import com.example.chess_java.boardgame.Board;
import com.example.chess_java.boardgame.Piece;

import lombok.Data;

@Data
public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
}
