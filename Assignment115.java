package module1;

 class Assignment115p {

	public Assignment115p()
	{
		System.out.println("public const");	
	}
	
    protected Assignment115p(int a)
	{
		System.out.println("protected const");	
	}

     Assignment115p(double b)
	{
		System.out.println("def/pkg const");	
	}

	private Assignment115p(char c)
	{
		System.out.println("private const");	
	}
 }

	public class Assignment115
	{
		
	public static void main(String[] args)
	{                                
		new Assignment115p();
		new Assignment115p(5);
		new Assignment115p(1.77);
		

	}
	
	}




