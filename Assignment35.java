package module1;

public class Assignment35 {

	static int gv=55;
	
	static void add()
	{
		int a=10;
		System.out.println("the local variable in static method: "+a);
		System.out.println("the global variable in static method: "+gv);
	}
	 
	 void sub()
	{
		 int a=20;
		 System.out.println("the local variable in static method: "+a);
		System.out.println("the global variable in non static method: "+gv);
	}

	public static void main(String[] args)
	{
		add();
		Assignment35 assg=new Assignment35();
	    assg.sub();
}
}