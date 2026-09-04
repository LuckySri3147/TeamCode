package module1;

  class Superclass11
 {

	 final void login()
	{
		System.out.println("login by email");	
	}
	
 
 }

 public class Assignment121 extends Superclass11 {
	 
	 void loginch()
		{
		
		System.out.println("login by phone num");	
		}
	 
	public static void main(String[] args)
	{                                
		Assignment121 a = new Assignment121() ;                                    

	a.login();
	a.loginch();
	
	}
	
	
	}





