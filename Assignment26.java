package module1;

public class Assignment26 {

	static void add(int a, int b)
	{
		
		System.out.println("static method");
	}

	  void add(int a)
	{
		  System.out.println("non-static method");
	}
	 
	  Assignment26(int a)
	  {
		  System.out.println("Constructor method");
	  }
	 
	public static void main(String[] args)
	{
		Assignment26 assg=new Assignment26(5);
		assg.add(9);
		add(11,9);	
	}
}