package com.chatgpt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the input string:");
        String inputString = reader.readLine();

        // Count "#" and "@" separators
        int hashCount = 0;
        int atCount = 0;
        for (char ch : inputString.toCharArray()) {
            if (ch == '#') {
                hashCount++;
            } else if (ch == '@') {
                atCount++;
            }
        }

        System.out.println("Number of '#' separators: " + hashCount);
        System.out.println("Number of '@' separators: " + atCount);

        // Replace "#" with "$"
        String replacedString = inputString.replace('#', '$');
        System.out.println("String with '#' replaced by '$': " + replacedString);

        // Extract and print FIRSTNAME in uppercase
        StringTokenizer tokenizer = new StringTokenizer(inputString, "#@");
        String firstName = tokenizer.nextToken().toUpperCase();
        System.out.println("FIRSTNAME in uppercase: " + firstName);

        // Extract and print LASTNAME in lowercase
        String lastName = tokenizer.nextToken().toLowerCase();
        System.out.println("LASTNAME in lowercase: " + lastName);

        // Replace all separators with space
        replacedString = inputString.replaceAll("[#@]", " ");
        System.out.println("String with separators replaced by space: " + replacedString);

        // Reverse FIRSTNAME characters
        StringBuilder reversedFirstName = new StringBuilder(firstName);
        reversedFirstName.reverse();
        System.out.println("FIRSTNAME characters in reverse order: " + reversedFirstName);
    }
}

