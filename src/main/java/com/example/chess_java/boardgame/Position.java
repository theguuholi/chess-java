package com.example.chess_java.boardgame;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Position {
    private int row;
    private int column;

    public String toString() {
        return row + ", " + column;
    }

}
