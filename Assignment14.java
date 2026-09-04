package module1;

public class Assignment14 {

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
		Assignment14 assg=new Assignment14();
		assg.add();
	    assg.sub();
	    assg.mul();
}
}