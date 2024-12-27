package com.example.chess_java.chess;

import com.example.chess_java.boardgame.Board;
import com.example.chess_java.boardgame.Piece;
import com.example.chess_java.boardgame.Position;

import lombok.Data;

@Data
public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
    
}
