package com.chatgpt;

import java.util.Arrays;

public class Anagrams {
	
	public static void main(String[] args) {
		
		String str1 = "Integral";
		
		String	str2 = "triangle";
		
		str1= str1.replaceAll("\\s", "").toLowerCase();
		str2= str2.replaceAll("\\s", "").toLowerCase();
		
		if(str1.length()!=str2.length()) {
			System.out.println("str and str2 Not Anagrams.");
			return ;
		}
		
		char[] charArray1=str1.toCharArray();
		char[] charArray2=str2.toCharArray();
		
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		
		
	boolean ana=Arrays.equals(charArray1, charArray2);
	if (ana) {
		System.out.println("This is Anagrams");
	} else {
		System.out.println("This is  Anagrams");
	}
	}

}
