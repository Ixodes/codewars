package by.ixodes.codewars.katas.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @autor ixodes
 * @since 2/13/22
 */
public class NextPrefectSquareTest {
    @Test
    public void test1() {
        assertEquals(144, NextPrefectSquare.findNextSquare(121));
    }

    @Test
    public void test2() {
        assertEquals(676, NextPrefectSquare.findNextSquare(625));
    }

    @Test
    public void test3() {
        assertEquals(-1, NextPrefectSquare.findNextSquare(114));
    }
}
