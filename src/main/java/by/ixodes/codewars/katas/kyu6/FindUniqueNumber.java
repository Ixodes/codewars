package by.ixodes.codewars.katas.kyu6;

/*
There is an array with some numbers. All numbers are equal except for one. Try to find it!
Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains at least 3 numbers.
The tests contain some very huge arrays, so think about performance.
*/

/**
 * @autor ixodes
 * @since 2/16/22
 */
public class FindUniqueNumber {

    public static double findUniq(double[] arr) {

        double first = arr[0];
        double second = 0;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (first == arr[i]) {
                count++;
            } else {
                second = arr[i];
                if (count >= 2) break;
            }
        }

        return count == 1 ? first : second;
    }
}
