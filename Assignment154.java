package module1;

import java.util.Arrays;

class Assignment154 {
	
	public static void main(String[] args)
	{                                
		String s="automation testing";
		
		System.out.println(s.replace('t', '7'));

		String s1="manual";
		
		System.out.println(s1.replace("ual", "ppp"));

		String s2="a S 34";
		
		System.out.println(s2.replaceAll("[a-z]", "ttt"));
		System.out.println(s2.replaceAll("[A-Z]", "ZZZ"));
		System.out.println(s2.replaceAll("[0-9]", "999"));

				
		}



}


