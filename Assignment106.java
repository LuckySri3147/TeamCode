package module1;

 class Assignment106 {

	public static void add()
	{
		System.out.println("public");	
	}
	
    protected static void sub()
	{
		System.out.println("protected");	
	}

	static void mul()
	{
		System.out.println("def/pkg");	
	}

	private static void div()
	{
		System.out.println("private");	
	}

	
	public static void main(String[] args)
	{                                
		
	add();
	sub();
	mul();
	div();
	}

}



