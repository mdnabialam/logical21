package com.test;

public class Count {
	public static void main(String[] args) {
		
		String str= "AAAABBAAA";
		// 4A2B3A output
		
		
		for(int i=0; i<str.length();i++) {
			int count=0;
			
			for(int j=i;j<str.length();) {
				if(str.charAt(i)== str.charAt(j)) {
					count++;
				    j++;
				}
				else {
					break;
				}
			}
			i=i+count-1;
			System.out.print(str.charAt(i)+""+count);
		}
		
		
	}
	
	
	

}
