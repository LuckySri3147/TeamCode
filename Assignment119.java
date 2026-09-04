package module1;

  class Superclass1
 {

	 void login()
	{
		System.out.println("login by email");	
	}
	
 
 }

 public class Assignment119 extends Superclass1 {
	 
	 void login()
		{
		 super.login();
		System.out.println("login by phone num");	
		}
	 
	public static void main(String[] args)
	{                                
		Assignment119 a = new Assignment119() ;                                    

	a.login();
	
	}
	
	
	}





