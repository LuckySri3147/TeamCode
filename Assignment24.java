package module1;

public class Assignment24 {

	static void add(int a, int b)
	{
		 int add=a+b;
		System.out.println("static 1: add is: "+add);
	}

	 static void add(double a, double b)
	{
		 double add=a+b;
		System.out.println("static 2: add is: "+add);
	}
	 
	 static void add(int a, double b)
	{
		 double add=a+b;
		System.out.println("static 3: add is: "+add);
	}
	
	 static void add(double a, int b)
	{
		 double add=a+b;
		System.out.println("static 4: add is: "+add);
	}
	
	 static void add(float a, double b)
	{
		 double add=a+b;
		System.out.println("static 5: add is: "+add);
	}
	 
	  void add(int a, float b)
	{
		 float add=a+b;
		System.out.println("non-static 1: add is: "+add);
	}
	
	  void add(float a, int b)
	{
		 float add=a+b;
		System.out.println("non-static 2: add is: "+add);
	}
	
	  void add(float b, float a)
	{
		 float add=a+b;
		System.out.println("non-static 3: add is: "+add);
	}
	 
	  void add(double a, float b)
	{
		 double add=a+b;
		System.out.println("non-static 4: add is: "+add);
	}
	
	  void add(double a, float b, int c)
	{
		 double add=a+b+c;
		System.out.println("non-static 5: add is: "+add);
	}
	
	 
	public static void main(String[] args)
	{
		add(5,9);
		add(90.9231,10.02349);
		add(67,33.0923487);
		add(9.092348, 90.92348);
		add(34.09f, 54.298374);
		
		Assignment24 assg=new Assignment24();
		assg.add(9,90.98f);
		assg.add(34.12f, 76);
		assg.add(23.23f, 12.12f);
		assg.add(23.09034, 56.09f);
		assg.add(12.23432, 34.23f, 98);

}
}