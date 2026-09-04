package module1;


public class Assignment76Child extends Assignment76Super {

 void add()
	
	{
		System.out.println("child class non-static add method from same package module 1 for assg 76");
	}

	public static void main(String[] args)
	{
		mul(); // mul class from parent class
		Assignment76Child ch=new Assignment76Child();
		ch.add(); // add class from child class
		ch.sub(); //sub class from grandparent class
		
	}
}

	

	
