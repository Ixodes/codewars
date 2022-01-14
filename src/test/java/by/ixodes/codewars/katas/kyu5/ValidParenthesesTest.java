package by.ixodes.codewars.katas.kyu5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @autor ixodes
 * @since 1/14/22
 */
public class ValidParenthesesTest {

    @Test
    public void sampleTest() {

        assertTrue(ValidParentheses.validParentheses("()"));
        assertFalse(ValidParentheses.validParentheses("())"));
        assertTrue(ValidParentheses.validParentheses("32423(sgsdg)"));
        assertFalse(ValidParentheses.validParentheses("(dsgdsg))2432"));
        assertTrue(ValidParentheses.validParentheses("adasdasfa"));
    }
}
