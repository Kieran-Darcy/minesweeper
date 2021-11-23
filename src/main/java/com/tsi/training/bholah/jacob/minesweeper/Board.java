package com.tsi.training.bholah.jacob.minesweeper;
import com.tsi.training.bholah.jacob.minesweeper.Tile;
import java.util.Arrays;

public class Board {
    ////attributes/////

    Tile[][] board = new Tile[10][10];//2d array of tile objects
    public int length = board.length;
    public int width = board[0].length;
    public int numberofbombs=5;

    ////constructors////

    public Board() {
        int bombx;
        int bomby;
        int i;
        int j;

        for(i=0;i<length;i+=1)
        {
        for(j=0;j<width;j+=1)
        {
            board[i][j] = new Empty(0,i,j,false,false);//placing emptys into the board
        }
        }

        for (i=0;i<numberofbombs;i+=1) {
            bombx = (int) (Math.random() * 10);
            bomby = (int) (Math.random() * 10);

            board[bombx][bomby] = new Bomb(bombx, bomby, false, false);//placing a bomb in the array(on the board)
        }
    }
    /////method//////
    public int getlength(){return length;}
    public int getwidth(){return width;}

    public void reveal (int x, int y) {}

    @Override// sets a deeptostring for the board
    public String toString() {
        return "Board{" +
        "board=" + Arrays.deepToString(board) +
                '}';


    }
}


