package by.ixodes.codewars.katas.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @autor ixodes
 * @since 8/5/22
 */
public class DigitalRootTest {

    @Test
    public void Test1() {
        assertEquals(7, DigitalRoot.digitalRoot(16));
    }

    @Test
    public void Test2() {
        assertEquals(6, DigitalRoot.digitalRoot(456));
    }
}
