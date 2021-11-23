package com.tsi.training.bholah.jacob.minesweeper;

public class Empty extends Tile
{
    /////attributes////

    ////constructors////
    public Empty(int value, int x, int y, boolean revealstate, boolean flagstate) {
        super(value, x, y, revealstate, flagstate);
    }
    ////methods////
    public void reveal(int x,int y)
    {
        // want this to switch from ? to actually value in the array and display it
        //System.out.println(getvalue());
        System.out.println("that was an empty space");
    }
}
