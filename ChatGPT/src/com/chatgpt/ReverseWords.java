package com.chatgpt;


public class ReverseWords {
    public static void main(String[] args) {
        String input = "The java good .";
        String output = reverseWords(input);
        System.out.println("Output string: " + output);
    }
    
    public static String reverseWords(String input) {
        // Split the input string into words
        String[] words = input.split(" ");
        
        // Create a StringBuilder to store the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();
        
        // Iterate through the words in reverse order and append them to the reversed sentence
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        
        // Remove the extra space at the end and return the reversed sentence
        return reversedSentence.toString().trim();
    }
}
