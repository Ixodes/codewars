package by.ixodes.codewars.katas.kyu6;

/*
Given a string of words, you need to find the highest scoring word.
Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
You need to return the highest scoring word as a string.
If two words score the same, return the word that appears earliest in the original string.
All letters will be lowercase and all inputs will be valid.
*/

import java.util.HashMap;
import java.util.Map;

/**
 * @autor ixodes
 * @since 8/5/22
 */
public class HighestScoringWord {

    private static final Map<String, Integer> ALPHABET = new HashMap<>();

    static {
        int letterValue = 0;
        for( String l : "abcdefghijklmnopqrstuvwxyz".split("")) {
            ALPHABET.put(l, ++letterValue);
        }
    }

    public static String high(String s) {
        String res = "";
        int value = 0;
        for (String w : s.split(" ")) {
            if (w.equals("")) {
                break;
            }

            int currentValue = 0;
            for (String l : w.split("")) {
                currentValue += ALPHABET.get(l);
            }

            if (currentValue > value) {
                res = w;
                value = currentValue;
            }
        }

        return res;
    }
}
