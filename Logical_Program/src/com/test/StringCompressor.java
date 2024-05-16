package com.test;

public class StringCompressor {

	  public static String compress(String str) {
	    StringBuilder sb = new StringBuilder();
	    int count = 1;
	    for (int i = 1; i < str.length(); i++) {
	      if (str.charAt(i) == str.charAt(i - 1)) {
	        count++;
	      } else {
	        sb.append(count);
	        sb.append(str.charAt(i - 1));
	        count = 1;  
	      }
	    }
	    sb.append(count);
	    sb.append(str.charAt(str.length() - 1));
	    return sb.toString();
	  }

	  public static void main(String[] args) {
	    String str = "AAAABBAAA";
	    String compressedString = compress(str);
	    System.out.println(compressedString); // Output: 4A2B3A
	  }
	}

