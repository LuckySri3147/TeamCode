package module1;

class Assignment143 {
	
	static int countalpha=0;
	
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
			
		}
		
		System.out.println("count of alphabet are: "+countalpha);
	

}
}



