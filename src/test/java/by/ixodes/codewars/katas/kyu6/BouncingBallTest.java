package by.ixodes.codewars.katas.kyu6;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @autor ixodes
 * @since 12/24/21
 */

public class BouncingBallTest {

    @Test
    public void test1() {
        assertEquals(3, BouncingBalls.bouncingBall(3.0, 0.66, 1.5));
    }
    @Test
    public void test2() {
        assertEquals(15, BouncingBalls.bouncingBall(30.0, 0.66, 1.5));
    }

    @Test
    public void test3() {
        assertEquals(1, BouncingBalls.bouncingBall(2.0, 0.5, 1.0));
    }
}
