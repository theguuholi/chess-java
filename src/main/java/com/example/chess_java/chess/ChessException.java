package com.example.chess_java.chess;

public class ChessException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }

}