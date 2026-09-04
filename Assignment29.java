package module1;

public class Assignment29 {

	 
	static void add(int a,int b)
	{
		 int c=a+b;
		 System.out.println("method overloading 1 res: "+c);
	}
	
	void add(double a, int b)
	{
		double c=a+b;
		 System.out.println("method overloading 2 res: "+c);
	}
	
	  Assignment29(int a, double b)
	  {
		  double c=a+b;
		  System.out.println("Constructor method 1 res: "+c);
	  }
	 
	  Assignment29(double b, int a)
	  {
		  double c=a+b;
		  System.out.println("Constructor method 2 res: "+c);
	  }
	  
	public static void main(String[] args)
	{
		add(5,6);
		Assignment29 assgn=new Assignment29(5,67.89);
		assgn.add(5.77, 7);
		new Assignment29(45.789,8);
			
	}
}