package module1;

 class Assignment114 {

	public Assignment114()
	{
		System.out.println("public const");	
	}
	
    protected Assignment114(int a)
	{
		System.out.println("protected const");	
	}

    void Assignment114(int b)
	{
		System.out.println("def/pkg const");	
	}

	private Assignment114(char c)
	{
		System.out.println("private const");	
	}

	
	public static void main(String[] args)
	{                                
		new Assignment114();
		new Assignment114(5);
		new Assignment114(5);
		new Assignment114('a');
	}

}



