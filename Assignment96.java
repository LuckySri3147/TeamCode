package module1;

 class Assignment96 {

	 Assignment96()
	{
		 this('r');
		System.out.println("const 1");
	}
	 
	 Assignment96(int a)
		{
		 this();
			System.out.println("const 2");
		} 
	 
	 Assignment96(char c)
		{
			System.out.println("const 3");
		} 


	public static void main(String[] args)
	{
		
		new Assignment96(8);
	}

}



