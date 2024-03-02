package org.solutions.codility.visitcounter;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.solutions.codility.visitcounter.VisitCounter.count;

class VisitCounterTest {

    @Test
    void testVisitCounter() {
        @SuppressWarnings("unchecked")
        Map<String, UserStats>[] visits = new HashMap[] {
                new HashMap<>(),
                new HashMap<>()
        };

        visits[0].put("100", new UserStats(Optional.of(3L)));
        visits[0].put("102", new UserStats(Optional.of(2L)));
        visits[0].put("", new UserStats(Optional.of(2L)));
        visits[0].put(null, new UserStats(Optional.of(2L)));

        visits[1].put("100", new UserStats(Optional.of(4L)));
        visits[1].put("103", new UserStats(Optional.of(1L)));
        visits[1].put("102", null);
        visits[1].put("101", null);

        assertEquals(Map.of(100L, 7L, 102L, 2L, 103L, 1L), count(visits));
    }
}