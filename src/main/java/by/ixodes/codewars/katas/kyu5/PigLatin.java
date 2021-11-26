package by.ixodes.codewars.katas.kyu5;

import java.util.Arrays;

/**
 * @autor ixodes
 * @since 11/26/21
 */

/*
Move the first letter of each word to the end of it,
then add "ay" to the end of the word.
Leave punctuation marks untouched.
Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !
*/

public class PigLatin {

    private static final String SEPARATOR = " ";
    private static final String END = "ay";
    private static final String LETTERS = "[a-zA-Z]+";

    public static String pigIt(String str) {

        String[] arr = str.split(SEPARATOR);
        StringBuilder res = new StringBuilder();
        Arrays.stream(arr).map(StringBuilder::new).forEach(w -> res.append(change(w)));
        return res.toString().trim();
    }

    private static StringBuilder change(StringBuilder s) {

        if (!s.toString().matches(LETTERS)) {
            return s;
        }
        return s.append(s.charAt(0))
                .deleteCharAt(0)
                .append(END)
                .append(SEPARATOR);
    }
}
