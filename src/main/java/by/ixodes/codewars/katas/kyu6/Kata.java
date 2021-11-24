package by.ixodes.codewars.katas.kyu6;

import java.util.Arrays;

/**
 * @autor ixodes
 * @since 11/24/21
 */

/*
Your goal in this kata is to implement a difference function, which subtracts one list
from another and returns the result.
It should remove all values from list a, which are present in list b keeping their order.
Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
If a value is present in b, all of its occurrences must be removed from the other:
Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
*/

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        Arrays.sort(b);
        return Arrays
                .stream(a)
                .filter(i -> Arrays.binarySearch(b, i) < 0)
                .toArray();
    }
}
