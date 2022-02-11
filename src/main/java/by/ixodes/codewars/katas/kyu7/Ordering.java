package by.ixodes.codewars.katas.kyu7;

import java.util.stream.Collectors;

/*
Given a string, you need to write a method that order every letter in this string in ascending order.
Also, you should validate that the given string is not empty or null. If so, the method should return:
"Invalid String!"
Notes
• the given string can be lowercase and uppercase.
• the string could include spaces or other special characters like '# ! or ,'. Sort them based on their ASCII codes
*/

/**
 * @autor ixodes
 * @since 2/11/22
 */

public class Ordering {
    public String orderWord(String s){
        return s == null || s.equals("") ? "Invalid String!" : s.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.joining());
    }
}
