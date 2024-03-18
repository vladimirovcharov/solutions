package org.solutions.others;

public class ReversWordsInArrayOfChars {

    public static void reversWordsInCharArray(char[] arr) {
        reverse(arr, 0, arr.length - 1);
        reverseWords(arr);
        System.out.println(arr);
    }

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void reverseWords(char[] arr) {
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            if (arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
        reverse(arr, start, arr.length - 1);
    }
}
