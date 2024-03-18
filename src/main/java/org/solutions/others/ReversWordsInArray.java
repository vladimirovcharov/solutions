package org.solutions.others;

public class ReversWordsInArray {
    public static String reversWords(String str) {
        String[] strArr = str.split(" ");
        for (int i = 0, j = strArr.length - 1; i < strArr.length / 2; i++, j--) {
            String temp = strArr[i];
            strArr[i] = strArr[j];
            strArr[j] = temp;
        }
        return String.join(" ", strArr);
    }
}
