package by.ixodes.codewars.katas.kyu5;

import java.util.*;

import static java.util.AbstractMap.*;

/**
 * @autor ixodes
 * @since 12/24/21
 */

/*
I'm sure, you know Google's "Did you mean ...?", when you entered a search term and mistyped a word.
In this kata we want to implement something similar.
You'll get an entered term (lowercase string) and an array of known words (also lowercase strings).
Your task is to find out, which word from the dictionary is most similar to the entered one. The similarity is
described by the minimum number of letters you have to add, remove or replace in order to get from the entered word
to one of the dictionary. The lower the number of required changes, the higher the similarity between each two words.
Same words are obviously the most similar ones. A word that needs one letter to be changed is more similar
to another word that needs 2 (or more) letters to be changed. E.g. the mistyped term berr is more similar
to beer (1 letter to be replaced) than to barrel (3 letters to be changed in total).
Extend the dictionary in a way, that it is able to return you the most similar word from the list of known words.

Code Examples:
Dictionary fruits = new Dictionary(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
fruits.findMostSimilar("strawbery"); // must return "strawberry"
fruits.findMostSimilar("berry"); // must return "cherry"

Dictionary things = new Dictionary(new String[]{"stars", "mars", "wars", "codec", "codewars"});
things.findMostSimilar("coddwars"); // must return "codewars"

Dictionary languages = new Dictionary(new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});
languages.findMostSimilar("heaven"); // must return "java"
languages.findMostSimilar("javascript"); // must return "javascript" (same words are obviously the most similar ones)
I know, many of you would disagree that java is more similar to heaven than all the other ones, but in this kata it is ;)

Additional notes:
there is always exactly one possible correct solution
*/

public class Dictionary {

    private final List<String> words;

    public Dictionary(String[] words) {
        this.words = Arrays.asList(words);
    }

    public String findMostSimilar(String to) {
        return to.length() == 0 ? to : words.stream()
                .map(s -> new SimpleEntry<>(getDistance(s, to), s))
                .min((e1, e2) -> e1.getKey() < e2.getKey() ? -1: 1).get().getValue();
    }

    private int getDistance(String s1, String s2) {
        return levDistance(s1, s2, s1.length() - 1, s2.length() - 1);
    }

    private int levDistance(String s1, String s2, int len1, int len2) {
        if (len1 == 0 && len2 == 0) {
            return 0;
        } else if (len1 == 0) {
            return len2;
        } else if (len2 == 0) {
            return len1;
        }

        return Math.min(levDistance(s1, s2, len1, len2 - 1) + 1,
                Math.min(levDistance(s1, s2, len1 - 1, len2) + 1,
                         levDistance(s1, s2, len1 - 1, len2 - 1) +
                            m(s1.charAt(len1), s2.charAt(len2))));

    }

    private int m(char c1, char c2) {
        return c1 == c2 ? 0 : 1;
    }
}
