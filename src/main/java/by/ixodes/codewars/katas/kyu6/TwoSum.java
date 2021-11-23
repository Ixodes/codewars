package by.ixodes.codewars.katas.kyu6;


import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Write a function that takes an array of numbers (integers for the tests) and a target number.
It should find two different items in the array that, when added together, give the target value.
The indices of these items should then be returned in a tuple like so: (index1, index2).
For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.
The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers;
target will always be the sum of two different items from that array).
 */
public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        return IntStream.range(0, numbers.length)
                .mapToObj(i -> IntStream.range(i + 1, numbers.length)
                        .filter(j -> (numbers[j] + numbers[i]) == target)
                        .mapToObj(j -> new int[]{i, j})
                        .collect(Collectors.toSet()))
                .flatMap(Set::stream)
                .collect(Collectors.toSet()).iterator().next();
    }
}
