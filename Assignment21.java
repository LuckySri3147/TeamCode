package module1;

public class Assignment21 {

	  void add(int a, int b)
	{
		 int add=a+b;
		System.out.println("add is: "+add);
	}
	
	  void add(int a, double b)
	{
		 double sub=a-b;
		System.out.println("add is: "+sub);
	}
	 
	  void add(double a, int b)
	{
		 double add=a*b;
		System.out.println("add is: "+add);
	}
	
	public static void main(String[] args)
	{
		Assignment21 assg21=new Assignment21();
		assg21.add(50,20);
		assg21.add(100,50.78);
		assg21.add(20.2,20);
}
}