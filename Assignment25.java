package module1;

public class Assignment25 {

	static void add()
	{
		
		System.out.println("static method");
	}

	  void add(int a)
	{
		  System.out.println("non-static method");
	}
	 
	  Assignment25()
	  {
		  System.out.println("Constructor method");
	  }
	 
	public static void main(String[] args)
	{
		Assignment25 assg=new Assignment25();
		assg.add(9);
		add();	
	}
}