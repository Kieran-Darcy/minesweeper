package com.tsi.training.bholah.jacob.minesweeper;

public class Bomb extends Tile
{
    /////attributes////

    ////constructors////

    public Bomb(int x, int y, boolean revealstate, boolean flagstate) {
        super(9, x, y, revealstate, flagstate);
    }
    ////methods////
    public void reveal(int position)
    {
        // want this to show a bomb was hit
        System.out.println("that was a bomb");
        System.out.println("you hit a bomb the game is over");
    }

}
