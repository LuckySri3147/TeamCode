package module1;

public class Assignment34 {

	static void add()
	{
		 int a=25, b=55,c;
		 c=a+b;
		System.out.println("static method res is: "+c);
	}
	
	 void sub()
	{
		 int a=15, b=85,c;
		 c=a-b;
		System.out.println("non-static method res is: "+c);
	}

	public static void main(String[] args)
	{
		add();
		Assignment34 assg=new Assignment34();
	    assg.sub();
}
}