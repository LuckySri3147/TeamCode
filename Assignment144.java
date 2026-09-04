package module1;

class Assignment144 {
	
	static int countdigits=0;
	
	public static void main(String[] args)
	{                                
		String in= " aLb Q(W 123 &^p* ";
		
		char []c = in.toCharArray();
		
		
		int i;
		for(i=0;i<in.length();i++)
		{

			boolean b2=Character.isDigit(c[i]);
			if(b2)
			{
				countdigits++;
			}

		}
		

		System.out.println("count of digits are: "+countdigits);



}
}



