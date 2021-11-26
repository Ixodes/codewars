package by.ixodes.codewars.katas.kyu5;

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

public class PigLatinShort {

    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
