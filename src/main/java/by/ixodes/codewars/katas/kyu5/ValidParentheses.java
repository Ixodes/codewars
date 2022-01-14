package by.ixodes.codewars.katas.kyu5;

/*
Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
The function should return true if the string is valid, and false if it's invalid.

Examples
"()"              =>  true
")(()))"          =>  false
"("               =>  false
"(())((()())())"  =>  true

Constraints
0 <= input.length <= 100

Along with opening (() and closing ()) parenthesis, input may contain any valid ASCII characters.
Furthermore, the input string may be empty and/or not contain any parentheses at all.
Do not treat other forms of brackets as parentheses (e.g. [], {}, <>).
*/

import java.util.Stack;

/**
 * @autor ixodes
 * @since 1/14/22
 */

public class ValidParentheses {

    public static boolean validParentheses(String parens) {

        var stack = new Stack<Integer>();
        var array = parens.chars().filter(c -> c == '(' || c == ')').toArray();

        for (int el : array) {
            if (el == '(') {
                stack.push(el);
            } else {
                if (stack.empty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
