package module1;

class Assignment145 {
	
	static int countalpha=0, countdigits=0, countspaces=0, countsplchar=0;
	
	public static void main(String[] args)
	{                                
		String in= " aLb Q(W 123 &^p* ";
		
		char []c = in.toCharArray();
		
		
		int i;
		for(i=0;i<in.length();i++)
		{
			boolean b1=Character.isAlphabetic(c[i]);
			if(b1)
			{
				countalpha++;
			}
				
			boolean b2=Character.isDigit(c[i]);
			if(b2)
			{
				countdigits++;
			}
			
			boolean b3=Character.isWhitespace(c[i]);
			if(b3)
			{
				countspaces++;
			}
			
		}
		
		System.out.println("count of alphabet are: "+countalpha);
		System.out.println("count of digits are: "+countdigits);
		System.out.println("count of white spaces are: "+countspaces);
		countsplchar=in.length()-(countalpha+countdigits+countspaces);
		System.out.println("count of special char are: "+countsplchar);


}
}



