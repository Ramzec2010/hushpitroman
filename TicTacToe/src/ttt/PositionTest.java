package ttt;

import org.junit.Test;

import static org.junit.Assert.*;
public class PositionTest {

    @Test
    public void testNew() throws Exception {
        Position position = new Position();
        assertEquals("         ", position.toString());
        assertEquals('x', position.turn);
    }

    @Test
    public void testMove() throws Exception {
        Position position = new Position().move(1);
        assertEquals(" x       ", position.toString());
        assertEquals('o', position.turn);
    }

    @Test
    public void testPossibleMoves() throws Exception {
        Position position = new Position().move(1).move(3).move(4);
        assertArrayEquals(new Integer[] {0,2,5,6,7,8}, position.possibleMoves());
    }

    @Test
    public void testWin() throws Exception {
        assertFalse(new Position().win('x'));
        assertTrue(new Position("xxx      ").win('x'));
        assertTrue(new Position("   ooo   ").win('o'));
        assertTrue(new Position("x  x  x  ").win('x'));
        assertTrue(new Position("  x x x  ").win('x'));
        assertTrue(new Position("x   x   x").win('x'));
    }

    @Test
    public void testMinimax() throws Exception {
        assertEquals(100, new Position("xxx      ").minimax());
        assertEquals(-100, new Position("ooo      ").minimax());
        assertEquals(0, new Position("xoxoxooxo").minimax());
        assertEquals(99, new Position(" xx      ", 'x').minimax());
        assertEquals(-99, new Position(" oo      ", 'o').minimax());
    }

    @Test
    public void testBestMove () throws Exception {
        assertEquals(0, new Position(" xx      ").bestMove());
        assertEquals(1, new Position("o o      ", 'o').bestMove());

    }

    @Test
    public void testGame() throws Exception {
        assertFalse(new Position().gameEnd());
        assertTrue(new Position("xxx      ").gameEnd());
    }


}
