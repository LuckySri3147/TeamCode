package module1;

public class Assignment20 {

	 static void add(int a, int b)
	{
		 int add=a+b;
		System.out.println("add is: "+add);
	}
	
	 static void add(double a, double b)
	{ 
		 double add=a-b;
		System.out.println("add is: "+add);
	}
	 
	 static void add(int a, double b)
	{
		 double add=a*b;
		System.out.println("add is: "+add);
	}
	
	public static void main(String[] args)
	{
		
		add(50,20);
	    add(100.7887,50.67);
	    add(20,20.65765);
}
}