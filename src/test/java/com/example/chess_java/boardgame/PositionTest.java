package com.example.chess_java.boardgame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    void createPosition() {
        Position position = new Position(3, 5);
        assertEquals(position.getRow(), 3);
        assertEquals(position.getColumn(), 5);
        assertEquals("3, 5", position.toString());
    }
}
