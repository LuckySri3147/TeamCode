package module1;

import module2.Assignment74Super;

public class Assignment74Child extends Assignment74Super {

 void add()
	
	{
		System.out.println("child class non-static add method same package module 1 for assg 74");
	}

	public static void main(String[] args)
	{
		Assignment74Child ch=new Assignment74Child();
		ch.mul(); // super class from another package module 2
		ch.add(); // same child class
		
	}
}

	

	
