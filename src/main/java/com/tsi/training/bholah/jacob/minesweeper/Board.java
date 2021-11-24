package com.tsi.training.bholah.jacob.minesweeper;

import com.tsi.training.bholah.jacob.minesweeper.Tile;

import java.util.Arrays;

public class Board {
    ////attributes/////

    Tile[][] board = new Tile[10][10];//2d array of tile objects
    public int length = board.length;
    public int width = board[0].length;

    ////constructors////

    public Board() {
        populateBoard();
        setValues();
    }


    /////methods//////

    // populates the board with empty tiles
    public void populateBoard() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                board[i][j] = Math.random() > 0.1 ? new Empty(0, i, j, true, false) : new Bomb(i, j, true, false);
            }
        }
    }

    public void setValues() {
        int bombCount = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].getValue()==9) continue;
                if (i == 0) {                                               //top
                    if (j == 0) {                                           //top left
                        bombCount += board[i][j+1].getValue()==9 ? 1 : 0;
                        bombCount += board[i+1][j+1].getValue()==9 ? 1 : 0;
                        bombCount += board[i+1][j].getValue()==9 ? 1 : 0;
                    } else if (j == 9) {                                    //top right
                        bombCount += board[i][j-1].getValue()==9 ? 1 : 0;
                        bombCount += board[i+1][j-1].getValue()==9 ? 1 : 0;
                        bombCount += board[i+1][j].getValue()==9 ? 1 : 0;
                    } else {                                                //top middle
                        bombCount += board[i][j-1].getValue()==9 ? 1 : 0;
                        bombCount += board[i+1][j-1].getValue()==9 ? 1 : 0;
                        bombCount += board[i+1][j].getValue()==9 ? 1 : 0;
                        bombCount += board[i+1][j+1].getValue()==9 ? 1 : 0;
                        bombCount += board[i][j+1].getValue()==9 ? 1 : 0;
                    }
                } else if (i == 9) {                                        //bottom
                    if (j == 0) {                                           //bottom left

                    } else if (j == 9) {                                    //bottom right

                    } else {

                    }
                }
            }
        }
    }

    public void reveal(int x, int y) {
    }

    @Override// sets a deeptostring for the board
    public String toString() {
        String str = "";
        for (Tile[] row : board) {
            str = str.concat(Arrays.toString(row) + "\n");
        }
        return str;


    }
}


