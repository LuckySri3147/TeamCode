package module1;

 class Assignment110 {

	public void add()
	{
		System.out.println("public");	
	}
	
    protected void sub()
	{
		System.out.println("protected");	
	}

    void mul()
	{
		System.out.println("def/pkg");	
	}

	private void div()
	{
		System.out.println("private");	
	}

	
	public static void main(String[] args)
	{                                
		Assignment110 a = new Assignment110();
	a.add();
	a.sub();
	a.mul();
	a.div();
	}

}



