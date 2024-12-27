
package com.example.chess_java.boardgame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    public void testBoardInitialization() {
        Board board = new Board(8, 8);
        assertEquals(8, board.getRows());
        assertEquals(8, board.getColumns());
    }

    @Test
    public void testSetRows() {
        Board board = new Board(8, 8);
        board.setRows(10);
        assertEquals(10, board.getRows());
    }

    @Test
    public void testSetColumns() {
        Board board = new Board(8, 8);
        board.setColumns(10);
        assertEquals(10, board.getColumns());
    }

    // @Test
    // public void testPieceByRowAndColumn() {
    //     Board board = new Board(8, 8);
    //     Piece piece = new Piece(board); // Assuming Piece has a default constructor
    //     board.pieces[0][0] = piece;
    //     assertEquals(piece, board.piece(0, 0));
    // }

    // @Test
    // public void testPieceByPosition() {
    //     Board board = new Board(8, 8);
    //     Piece piece = new Piece(board); // Assuming Piece has a default constructor
    //     Position position = new Position(0, 0); // Assuming Position has a constructor with row and column
    //     board.pieces[0][0] = piece;
    //     assertEquals(piece, board.piece(position));
    // }
}
