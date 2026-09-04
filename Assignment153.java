package module1;

import java.util.Arrays;

class Assignment153 {
	
	public static void main(String[] args)
	{                                
		String s="automation ytesting";
		
		String [] s1=s.split("u");
		System.out.println(Arrays.toString(s1));

		String [] s2=s.split("");
		System.out.println(Arrays.toString(s2));

		String [] s3=s.split(" ");
		System.out.println(Arrays.toString(s3));

		String [] s4=s.split("t");
		System.out.println(Arrays.toString(s4));

		String [] s5=s.split("a");
		System.out.println(Arrays.toString(s5));		
		
		}



}


