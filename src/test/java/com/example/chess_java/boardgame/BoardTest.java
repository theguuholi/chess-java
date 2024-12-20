
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
}
