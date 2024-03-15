package org.solutions.others;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharsOccursInString {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> result = new HashMap<>();

        for (char c : str.toCharArray()) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }

        return result;
    }

    public static Map<String, Integer> countUseStream(String str) {
        return str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));
    }
}
