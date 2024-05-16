package com.test;
/*
 * Get as input, a string value from the keyboard. The input string should be in the below format:
FIRSTNAME#MIDDLENAME#LASTNAME@AGE  #MD#NABI#ALAM@26
(Note the separators carefully in the above format)   
You are allowed to use the following Java APIs                                                   
  (1) BufferedReader                                                             
  (2) InputStreamReader                                                         
  (3) StringTokenizer                                                           
  (4) StringBuilder                                                             
  (5) String.substring                                                           
                    
Write the code to output the following:                                                           
Print the no of “#” separators in input string.                               
Print the no of “@” separators in input string.                               
Replace all the "#" separators by "$" and print the full string.             
Print value of FIRSTNAME in UPPERCASE.                                     
Print value of LASTNAME in lowercase.                                       
Replace all the separators with space and print the entire string.           
Print the FIRSTNAME characters in reverse order.     
 */

public class Inter23 {
	
	public static void main(String[] args) {
		String input ="#MD#NABI#ALAM@26";
		String [] firstname=convFirstupp(input);
		
		//System.out.println("Output");
		
		for (String name : firstname) {
			System.out.println(name + " ");
		}
		System.out.println();
		
		int coutPo=countOcc(input,'#');
		System.out.println("Totel No of #" +coutPo);
		
		int  chuntAT= countOcc(input, '@');
			
		System.out.println("total no @"+ chuntAT);
		
		String replaceString = input.replace('#', '$');
		System.out.println("String after repl" + replaceString);
		
	}
	
	public static String[]  convFirstupp(String input) {
		String[] pt = input.split("[#@]");
		
		for(int i=0; i<pt.length; i++) {
			pt[i]=pt[i].substring(0,1).toUpperCase()+pt[i].substring(1);
		}
		return pt;
		
	}
	
	public static int  countOcc(String str,char symbol) {
		int count =0;
		for(char ch: str.toCharArray()) {
			if(ch ==symbol) {
				count ++;
			}
		}
		return count;
	}

}


















