package by.ixodes.codewars.katas.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class IsogramTest {

    @Test
    public void FixedTests() {
        Isogram isogram = new Isogram();
        assertEquals(true, isogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, isogram.isIsogram("isogram"));
        assertEquals(false, isogram.isIsogram("moose"));
        assertEquals(false, isogram.isIsogram("isIsogram"));
        assertEquals(false, isogram.isIsogram("aba"));
        assertEquals(false, isogram.isIsogram("moOse"));
        assertEquals(true, isogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, isogram.isIsogram(""));
    }
}
