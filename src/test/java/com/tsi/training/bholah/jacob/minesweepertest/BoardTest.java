package com.tsi.training.bholah.jacob.minesweepertest;
import com.tsi.training.bholah.jacob.minesweeper.Board;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BoardTest {

    @Test
    public void testBoard()
    {
        Board testboard = new Board();
        assertEquals(10,testboard.getlength(),"the board length is wrong");
        assertEquals(10,testboard.getwidth(),"the board width is wrong");
    }
}
