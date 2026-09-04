package module1;

import module2.Assignment73Super;

public class Assignment73Child extends Assignment73Super {

	static void add()
	
	{
		System.out.println("child class static add method same package module 1 for assg 73");
	}

	public static void main(String[] args)
	{
		mul(); // super class from another package module 2
		add(); // same child class
		
	}
}

	

	
