package by.ixodes.codewars.katas.kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @autor ixodes
 * @since 2/19/22
 */
public class FactorialDecompositionTest {

    private static void testing(int n, String expected) {
        System.out.println("N: " + n);
        String actual = FactorialDecomposition.decomp(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        testing(17, "2^15 * 3^6 * 5^3 * 7^2 * 11 * 13 * 17");
        testing(5, "2^3 * 3 * 5");
        testing(22, "2^19 * 3^9 * 5^4 * 7^3 * 11^2 * 13 * 17 * 19");
        testing(14, "2^11 * 3^5 * 5^2 * 7^2 * 11 * 13");
        testing(25, "2^22 * 3^10 * 5^6 * 7^3 * 11^2 * 13 * 17 * 19 * 23");
    }
}
