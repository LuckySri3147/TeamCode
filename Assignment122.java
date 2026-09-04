package module1;

 abstract class Parentclass
 {

	abstract void b1(); // abstract method
	abstract void b2();  // abstract method
	
 
 }

 public class Assignment122 extends Parentclass {
	 
	 void loginch()  // concrete method
		{
		System.out.println("login by phone num");	
		}
	 
	public static void main(String[] args)
	{                                
		Assignment122 a = new Assignment122();
		a.b1();
		a.b2();
		a.loginch();
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





