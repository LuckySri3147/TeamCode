package module1;

 class Assignment87Super {

	static void sub()
	{
		
		System.out.println("Super class for assg 87: ");
	}

}

 class Assignment87Child2 extends Assignment87Super {
	
	static void add()
	
	{ 
		System.out.println("Child Class 2 class for assg 87: ");
	}
	
	public static void main(String[] args)
	{
		sub();
		add();
		
	}
}


public class Assignment87Child1 extends Assignment87Super {

	void add1()
	
	{
		System.out.println("child class 1 for assg 87: ");
	}

	public static void main(String[] args)
	{
		
		Assignment87Child1 c=new Assignment87Child1();
		c.add1();
		sub();
	}
}



