package by.ixodes.codewars.katas.kyu5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Greed is a dice game played with five six-sided dice. Your mission, should you choose to accept it,
is to score a throw according to these rules. You will always be given an array with five six-sided dice values.

 Three 1's => 1000 points
 Three 6's =>  600 points
 Three 5's =>  500 points
 Three 4's =>  400 points
 Three 3's =>  300 points
 Three 2's =>  200 points
 One   1   =>  100 points
 One   5   =>   50 point
*/
public class GreedIsGood {

    private static Map<Integer, Integer> rules = new HashMap<Integer, Integer>() {{
        put(1, 1000);
        put(6, 600);
        put(5, 500);
        put(4, 400);
        put(3, 300);
        put(2, 200);
    }};

    public static int greedy(int[] dice){
        AtomicLong count = new AtomicLong(0);
        Arrays.stream(dice)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> count.addAndGet(getCount(k, v))
        );
        return count.intValue();
    }

    private static long getCount(int dice, long count) {
        if(count < 3) {
            if(dice == 1) return 100 * count;
            if(dice == 5) return 50 * count;
        } else {
            return rules.get(dice) + getCount(dice, count - 3);
        }
        return 0;
    }
}
