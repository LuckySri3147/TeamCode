package module1;

 abstract class Parentclass1
 {

	abstract void b1(); // abstract method
	abstract void b2();  // abstract method
	static void b3()   // concrete method
	{
		System.out.println("b3 method");	

	}
	 void b4()   // concrete method
	{
		System.out.println("b4 method");	

	}
 
 }

 public class Assignment123 extends Parentclass1 {
	 
	 void b5()  // concrete method
		{
		System.out.println("conc method b5");	
		}
	 
	public static void main(String[] args)
	{                                
		Assignment123 a = new Assignment123();
		a.b1();
		a.b2();
		a.b4();
		a.b5();
		b3();
		
	}

	@Override
	void b1() {
		// TODO Auto-generated method stub
		System.out.println("b1 method");	

	}

	@Override
	void b2() {
		// TODO Auto-generated method stub
		System.out.println("b2 method");	

	}
	
	
	}





