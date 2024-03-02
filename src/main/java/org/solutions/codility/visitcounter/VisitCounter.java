package org.solutions.codility.visitcounter;

import java.util.*;

public class VisitCounter {
    @SafeVarargs
    static Map<Long, Long> count(Map<String, UserStats>... visits) {
        if (visits == null || visits.length == 0) {
            return Collections.emptyMap();
        }
        Map<Long, Long> result = new HashMap<>();

        Arrays.stream(visits).flatMap(visit -> visit.entrySet().stream()).forEach(entry -> {
            String key = entry.getKey();
            if (key == null || key.isEmpty()) {
                return;
            }
            try {
                Long parsedKey = Long.parseLong(key);
                UserStats userStats = entry.getValue();
                if (userStats == null || userStats.visitCount().isEmpty()) {
                    return;
                }
                result.put(parsedKey, result.getOrDefault(parsedKey, 0L) + userStats.visitCount().get());
            } catch (NumberFormatException e) {
                // NOSONAR
            }
        });
        return result;
    }
}

record UserStats(Optional<Long> visitCount) {
}