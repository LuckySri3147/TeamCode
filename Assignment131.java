package module1;

class Assignment131 {
	

	public static void main(String[] args)
	{                                
		String s1="radar";
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c=s1.charAt(i);
			rev=rev+c;
		}
		
		System.out.println(s1);
		System.out.println(rev);

		if(rev.equals(s1))
		{
			System.out.println("palindrome");

		}
		else
			System.out.println("not a palindrome");
	}

}



