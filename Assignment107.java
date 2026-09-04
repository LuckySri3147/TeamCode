package module1;

  class As
 {

	public static void add()
	{
		System.out.println("public");	
	}
	
    protected static void sub()
	{
		System.out.println("protected");	
	}

	static void mul()
	{
		System.out.println("def/pkg");	
	}

	private static void div()
	{
		System.out.println("private");	
	}
	
 }

	public class Assignment107 {
	public static void main(String[] args)
	{                                
		As a = new As() ;                                    

	As.add();
	As.sub();
	As.mul();
	
	}
	}





