package by.ixodes.codewars.katas.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @autor ixodes
 * @since 12/29/21
 */
public class TenMinWalkTest {
    @Test
    public void Test() {
        assertEquals(true, TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}), "Should return true");
        assertEquals(false, TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}), "Should return false");
        assertEquals(false, TenMinWalk.isValid(new char[] {'w'}), "Should return false");
        assertEquals(false, TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}), "Should return false");
    }
}
