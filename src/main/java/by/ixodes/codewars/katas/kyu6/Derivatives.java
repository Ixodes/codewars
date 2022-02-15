package by.ixodes.codewars.katas.kyu6;

/*
You are provided with a function of the form f(x) = axⁿ, that consists of a single term only and 'a' and 'n' are integers,
e.g f(x) = 3x², f(x) = 5 etc.
Your task is to create a function that takes f(x) as the argument and returns the result of differentiating the function,
that is, the derivative.

If f(x)=axn
f(x)=ax n, then f′(x)=nax n−1f ′ (x)=nax n−1

Input is a string, for example "5x^4". The function f(x) consists of a single term only. Variable is denoted by x.
Output should be a string, for example "20x^3".

Examples
"3x^2"  => "6x"
"-5x^3" => "-15x^2"
"6x^-2" => "-12x^-3"
"5x"    => "5"
"-x"    => "-1"
"42"    => "0"*/

/**
 * @autor ixodes
 * @since 2/15/22
 */

public class Derivatives {

    public static String differentiate(String function) {

        if (function.equals("x")) return "1";
        if (function.equals("-x")) return "-1";
        if (!function.contains("x")) { return "0"; }

        String[] parts = function.split("x");

        int pow = 1;
        if (parts.length == 2) {
            int powIndex = parts[1].indexOf("^");
            pow = powIndex == -1 ? 1 : Integer.parseInt(parts[1].substring(powIndex + 1));
        }

        int constant = parts[0].length() == 0 ? 1 : parts[0].equals("-") ? -1 : Integer.parseInt(parts[0]);

        int newConstant = constant * pow;
        int newPow = pow - 1;
        return newConstant == 1 ? "" : newConstant == -1 ? "-" : newConstant
                + (newPow == 1 ? "x" : newPow == 0 ? "" : "x^" + newPow);
    }
}
