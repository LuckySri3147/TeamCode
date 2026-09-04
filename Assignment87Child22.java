package module1;

 class Assignment87Superr {

	static void sub()
	{
		
		System.out.println("Super class for assg 87: ");
	}

}
 

 class Assignment87Child11 extends Assignment87Super {
	
	static void add()
	
	{ 
		System.out.println("Child Class 1 class for assg 87: ");
	}
 }
	
	

public class Assignment87Child22 extends Assignment87Super {

	void mul()
	
	{
		System.out.println("child class 2 for assg 87: ");
	}



	public static void main(String[] args)
	{
		
		Assignment87Child22 c=new Assignment87Child22();
		c.mul();
		sub();
		
		Assignment87Child11 c1=new Assignment87Child11();
		Assignment87Child11.add();
		sub();

		
	}

}



