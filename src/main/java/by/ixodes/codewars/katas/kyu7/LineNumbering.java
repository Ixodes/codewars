package by.ixodes.codewars.katas.kyu7;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class LineNumbering {

    public static List<String> number(List<String> lines) {
        AtomicInteger counter = new AtomicInteger(0);
        return lines.stream()
                .map(s -> counter.incrementAndGet() + ": " + s)
                .collect(Collectors.toList());
    }
}
