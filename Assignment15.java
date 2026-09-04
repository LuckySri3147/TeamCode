package module1;

public class Assignment15 {

	 void add()
	{
		System.out.println("non-static method 1");
	}
	
	 void sub()
	{
		System.out.println("non-static method 2");
	}
	 
	 void mul()
		{
			System.out.println("non-static method 3");
		}
	
	public static void main(String[] args)
	{
		new Assignment15().add();  // creating an object to call non-static method
		new Assignment15().sub();  // creating an object to call non-static method
		new Assignment15().mul();  // creating an object to call non-static method
		   
	   
}
}