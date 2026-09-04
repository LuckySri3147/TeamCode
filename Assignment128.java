package module1;

class Assignment128 {
	
	public static void main(String[] args)
	{                                
		String s="AutoMation";
		String rev="";
		
		for (int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			 rev=rev+c;
		}
		System.out.println(rev);
	}

}



