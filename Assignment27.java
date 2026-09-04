package module1;

public class Assignment27 {

	 
	  Assignment27(int a)
	  {
		  System.out.println("Constructor method 1");
	  }
	 
	  Assignment27()
	  {
		  System.out.println("Constructor method 2");
	  }
	  
	public static void main(String[] args)
	{
		new Assignment27(5);
		new Assignment27();
			
	}
}