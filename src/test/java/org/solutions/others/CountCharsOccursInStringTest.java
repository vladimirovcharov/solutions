package org.solutions.others;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountCharsOccursInStringTest {

    @Test
    void shouldCountOccurs() {
        String str = "fdsfss";
        Map<Character, Integer> actual = CountCharsOccursInString.count(str);

        Map<Character, Integer> expected = Map.of('f', 2, 'd', 1, 's', 3);
        assertEquals(expected, actual);

        printMap(actual);
    }

    @Test
    void shouldCountOccursUsingStream() {
        String str = "adbbsdssd";
        Map<String, Integer> actual = CountCharsOccursInString.countUseStream(str);

        Map<String, Integer> expected = Map.of("a", 1, "d", 3, "b", 2, "s", 3);
        assertEquals(expected, actual);

        printMap(actual);
    }

    private static void printMap(Map<?, ?> actual) {
        actual.entrySet().stream().map(entry -> entry.getKey() + " " + entry.getValue()).forEach(System.out::println);
    }
}