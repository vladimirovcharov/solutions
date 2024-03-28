package org.solutions.leetcode.strings;

public class StringCompression443 {
    public static int compress(char[] chars) {
        int index = 0;
        int counter = 0;

        for (int i = 0; i < chars.length; i++) {
            counter++;
            if (i + 1 == chars.length || chars[i] != chars[i + 1]) {
                chars[index] = chars[i];
                index++;
                if (counter != 1) {
                    for (char c : Integer.toString(counter).toCharArray()) {
                        chars[index++] = c;
                    }
                }
                counter = 0;
            }

        }

        return index;
    }
}
