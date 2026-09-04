package module1;

public class Assignment28 {

	 
	  Assignment28(int a, double b)
	  {
		  double c=a+b;
		  System.out.println("Constructor method 1 res: "+c);
	  }
	 
	  Assignment28(double b, int a)
	  {
		  double c=a+b;
		  System.out.println("Constructor method 2 res: "+c);
	  }
	  
	public static void main(String[] args)
	{
		new Assignment28(5,78.66);
		new Assignment28(45.789,8);
			
	}
}