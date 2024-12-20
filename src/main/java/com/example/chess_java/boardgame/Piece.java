package com.example.chess_java.boardgame;

import lombok.Data;

@Data
public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

}
