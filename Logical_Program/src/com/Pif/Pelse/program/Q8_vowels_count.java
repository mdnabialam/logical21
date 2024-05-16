package com.Pif.Pelse.program;

import java.util.Scanner;

public class Q8_vowels_count {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the alphabet ");
		
		
		char alphabet = scanner.next().charAt(0);
		scanner.close();
		if (alphabet == 'a' || alphabet =='e' ||
				alphabet =='i' ||alphabet =='o'|| alphabet == 'u') {
			System.out.println(alphabet +" : is vowel");
		}
		else {
			System.out.println(alphabet+" : is consonant");
		}
	}

}
