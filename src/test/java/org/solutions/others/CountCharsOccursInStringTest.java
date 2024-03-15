package org.solutions.others;

import org.junit.jupiter.api.Test;

import java.util.List;
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

    @Test
    void shouldCountOccursUsingCharacterAndLong() {
        String str = "ddbbss";
        Map<Character, Long> actual = CountCharsOccursInString.countUseCharacterAndLong(str);

        Map<Character, Long> expected = Map.of('d', 2L, 'b', 2L, 's', 2L);
        assertEquals(expected, actual);

        printMap(actual);
    }

    @Test
    void shouldCountOccursAndReturnInOrder() {
        String str = "dbdada";
        Map<Character, Long> actualMap = CountCharsOccursInString.countUseCharacterAndLong(str);

        var actualList = CountCharsOccursInString.getOrderedList(actualMap);
        var expectedList = List.of(
                Map.entry('a', 2L),
                Map.entry('b', 1L),
                Map.entry('d', 3L)
        );
        assertEquals(expectedList, actualList);
        System.out.println(actualList);
    }

    private static void printMap(Map<?, ?> actual) {
        actual.entrySet().stream().map(entry -> entry.getKey() + " " + entry.getValue()).forEach(System.out::println);
    }
}