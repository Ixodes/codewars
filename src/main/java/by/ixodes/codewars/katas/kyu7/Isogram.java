package by.ixodes.codewars.katas.kyu7;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean  isIsogram(String str) {
        Set<Character> set = new HashSet<>();
        for(Character c : str.toLowerCase().toCharArray()) {
            if (set.contains(c)) {
                return false;
            } else {
                set.add(c);
            }
        }
        return true;
    }
}
