package by.ixodes.codewars.katas.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @autor ixodes
 * @since 2/11/22
 */
public class OrderingTest {

    Ordering order = new Ordering();

    @Test
    public void test1_HelloWorld() {
        assertEquals(" !,HWdellloor", order.orderWord("Hello, World!"));
    }

    @Test
    public void test2_completesolution() {
        assertEquals("ceeillmnooopsttu", order.orderWord("completesolution"));
    }

    @Test
    public void test3_nonletters() {
        assertEquals("!\"#$%&(*@[]^", order.orderWord("\"][@!#$*(^&%"));
    }

    @Test
    public void test4_lettersandnot() {
        assertEquals("!\"#$%&(@[]^addilorrwz", order.orderWord("i\"d][@z!#$r(^a&world%"));
    }

    @Test
    public void test7_null_empty() {
        String s = null;
        assertEquals("Invalid String!", order.orderWord(s));
        assertEquals("Invalid String!", order.orderWord(""));
    }
}
