package module1;

public class Assignment39 {

	static int gv=55;

	public static void main(String[] args)
	{
		int gv=60;
		System.out.println("the local variable in main method: "+gv);
				
		System.out.println("the global variable in main method using class name: "+Assignment39.gv);
		
		Assignment39 asg=new Assignment39();
		System.out.println("the global variable in main method using obj reference: "+asg.gv);
		
}
}