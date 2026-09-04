package module1;

 public class Assignment116 {

	public Assignment116() 
	{
		this(5);
		System.out.println("public const");	
	}
	
    protected Assignment116(int a)
	{
    	this(4.77);
		System.out.println("protected const");	
	}

     Assignment116(double b)
	{
    	 this('t');
		System.out.println("def/pkg const");	
	}

	private Assignment116(char c)
	{
		
		System.out.println("private const");	
	}
 }




