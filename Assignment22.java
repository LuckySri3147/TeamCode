package module1;

public class Assignment22 {

	  static void add(int a, double b)
	{
		 double add=a+b;
		System.out.println("add is: "+add);
	}
	
	 void add(double b, int a)
	{
		 double add=a+b;
		System.out.println("add is: "+add);
	}
	 
	
	public static void main(String[] args)
	{
		add(30,45.88);
		Assignment22 assg21=new Assignment22();
		assg21.add(100.78,50);

}
}