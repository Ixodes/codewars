package by.ixodes.codewars.katas.kyu7;

public class Chocolate {

    public static int breakChocolate(int n, int m) {
        return (n<1 || m<1) ? 0 : (n - 1) + n * (m - 1);
    }
}
