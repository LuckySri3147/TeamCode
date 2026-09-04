package module1;


public class Assignment83Child extends Assignment83Super{

	Assignment83Child(int b)
	{ 
		super('S');
		System.out.println("Child class constructor");
	}

	public static void main(String[] args)
	{
		new Assignment83Child(400);
		
	}
	
}



	

	
