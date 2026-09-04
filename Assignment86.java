package module1;

class Assignment86Super  {
	
	Assignment86Super()
	
	{ 
		this(6);
				System.out.println("Super class 1 for assg 86: ");
	}
	
	Assignment86Super(int b)
	
	{ 
				System.out.println("Super class 2 for assg 86: ");
	}

	
}


public class Assignment86 extends Assignment86Super {

	Assignment86() 
	
	{

		System.out.println("child class 1 for assg 86: ");
	}
	
	Assignment86(int a)
	
	{
	 this();
		System.out.println("child class 2 for assg 86: ");
	
	}
	
	Assignment86(double b)
	
	{
	 this(7);
		System.out.println("child class 3 for assg 86: ");
	}


	public static void main(String[] args)
	{
		new Assignment86(98.88);
		
	}
}



