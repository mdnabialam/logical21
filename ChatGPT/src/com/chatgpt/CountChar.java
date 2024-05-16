package com.chatgpt;

import java.util.HashMap;
import java.util.Map;

public class CountChar {
	
	public static void main(String[] args) {
		String input = "shaping digital energy economy";
		
		Map<Character, Integer> charCountNUmber= countChar(input);
		for (Map.Entry<Character, Integer> entry :charCountNUmber.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+ "  : "+entry.getValue());
			}
		}
	}
	
	
	public static Map<Character, Integer> countChar(String str){
		Map<Character, Integer> map= new  HashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c,map.getOrDefault(c,0)+1);
		}
		return map;
	}

}
