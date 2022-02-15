package by.ixodes.codewars.katas.kyu5;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @autor ixodes
 * @since 11/26/21
 */
public class PigLatinTest {

    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
        assertEquals("hisTay siay ymay tringsay !", PigLatin.pigIt("This is my string !"));
        assertEquals("hisTay siay ymay tringsay qay", PigLatin.pigIt("This is my string q"));
    }

    @Test
    public void FixedTestsShort() {
        assertEquals("igPay atinlay siay oolcay", PigLatinShort.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatinShort.pigIt("This is my string"));
        assertEquals("hisTay siay ymay tringsay !", PigLatinShort.pigIt("This is my string !"));
        assertEquals("hisTay siay ymay tringsay qay", PigLatinShort.pigIt("This is my string q"));
    }
}
