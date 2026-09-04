package module1;

  class Superclass
 {

	 void login()
	{
		System.out.println("login by email");	
	}
	
 
 }

 public class Assignment118 extends Superclass {
	 
	 void login()
		{
			System.out.println("login by phone num");	
		}
	 
	public static void main(String[] args)
	{                                
		Assignment118 a = new Assignment118() ;                                    

	a.login();
	
	}
	
	
	}





