package com.example.chess_java.boardgame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PieceTest {
    @Test
    void create() {
        Board board = new Board(8, 8);
        Piece piece = new Piece(board);
        assertNotNull(piece);
        assertEquals(board, piece.getBoard());
    }

    @Test
    void testPosition() {
        Board board = new Board(8, 8);
        Piece piece = new Piece(board);
        Position position = new Position(1, 1);
        piece.setPosition(position);
        assertEquals(position, piece.getPosition());
    }
}
