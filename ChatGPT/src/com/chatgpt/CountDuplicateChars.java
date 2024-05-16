package com.chatgpt;

public class CountDuplicateChars {

    public static void main(String[] args) {
        String str = "Better Butter";
        countDuplicateCharacters(str);
    }

    public static void countDuplicateCharacters(String str) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ":" + charCount[i]);
            }
        }
    }
}
