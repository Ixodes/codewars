package by.ixodes.codewars.katas.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @autor ixodes
 * @since 8/2/22
 */
public class MultiplesOf3or5Test {

    @Test
    public void test() {
        assertEquals(23, new MultiplesOf3or5().solution(10));
    }
}
