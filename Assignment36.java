package module1;

public class Assignment36 {

	final static int a=90;
	
	static void add()
	{
		int b=45,c;
		 c=a+b;
		System.out.println("static method res is: "+c);
	}
	
	 void sub()
	{
			int b=80,c;
			 c=a-b;
		System.out.println("non-static method res is: "+c);
	}

	public static void main(String[] args)
	{
		add();
		Assignment36 assg=new Assignment36();
	    assg.sub();
}
}