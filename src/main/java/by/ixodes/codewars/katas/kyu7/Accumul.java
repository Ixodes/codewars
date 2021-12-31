package by.ixodes.codewars.katas.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @autor ixodes
 * @since 12/29/21
 */

/*
This time no story, no theory. The examples below show you how to write function accum:
Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
*/

public class Accumul {

    public static String accum(String s) {

        return IntStream.range(0, s.length())
                .mapToObj(i -> {
                    var el = String.valueOf(s.charAt(i));
                    return el.toUpperCase() + el.repeat(i).toLowerCase();
                }).collect(Collectors.joining("-"));
    }
}
