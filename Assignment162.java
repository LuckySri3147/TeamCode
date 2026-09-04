package module1;

import java.util.Arrays;

class Assignment162 {
	
	public static void main(String[] args)
	{                                
		String s1="utct";
		String s2="crat";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("String is not at all an Anagram");
		}
		else
		{
			char [] c1=s1.toCharArray();
			char [] c2=s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			if(Arrays.equals(c1, c2))
				System.out.println("String is an Anagram");
			else
				System.out.println("String is not an Anagram");
			
		}
		
		
		
	}

}



