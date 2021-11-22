package com.tsi.training.bholah.jacob.minesweeper;

import java.util.Arrays;

public class Board {
    ////attributes/////

    Tile[][] board = new Tile[10][10];//2d array of tile objects
    public int length = board.length;
    public int width = board[0].length;
    ////constructors////
    public Board() {
        board[2][2] = new Bomb(2, 2, false, false);//placing a bomb in the array(on the board)
    }

    /////method//////

    @Override// sets a deeptostring for the board
    public String toString() {
        return "Board{" +
        "board=" + Arrays.deepToString(board) +
                '}';
    }
}


