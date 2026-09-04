package module1;

public class Assignment13 {

	 void add()
	{
		System.out.println("non-static method 1 -");
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
		Assignment13 assg1=new Assignment13();
		assg1.add();
		
		Assignment13 assg2=new Assignment13();
	    assg2.sub();
	    
		Assignment13 assg3=new Assignment13();
	    assg3.mul();
}
}