package module1;


public class Assignment75Child extends Assignment75Super {

 void add()
	
	{
		System.out.println("child class non-static add method from same package module 1 for assg 75");
	}

	public static void main(String[] args)
	{
		mul(); // mul class from super class
		Assignment75Child ch=new Assignment75Child();
		ch.add(); // same child class
		
	}
}

	

	
