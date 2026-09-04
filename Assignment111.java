package module1;

  class As1
 {

	public void add()
	{
		System.out.println("public");	
	}
	
    protected void sub()
	{
		System.out.println("protected");	
	}

	 void mul()
	{
		System.out.println("def/pkg");	
	}

	private void div()
	{
		System.out.println("private");	
	}
	
 }

 public class Assignment111 {
	public static void main(String[] args)
	{                                
		As1 a = new As1() ;                                    

	a.add();
	a.sub();
	a.mul();
	
	
	}
	}





