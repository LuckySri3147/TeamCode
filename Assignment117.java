package module1;

 public class Assignment117 {

	public Assignment117() 
	{
		this(5);
		System.out.println("public const");	
	}
	
    protected Assignment117(int a)
	{
    	this(4.77);
		System.out.println("protected const");	
	}

     Assignment117(double b)
	{
    	 this('t');
		System.out.println("def/pkg const");	
	}

	private Assignment117(char c)
	{
		
		System.out.println("private const");	
	}
 }




