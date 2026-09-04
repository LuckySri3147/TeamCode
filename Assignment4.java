package module1;

public class Assignment4 {

	static void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition Result is: "+ c );
	}
	
	static void sub(int a, int b)
	{
		int c=a-b;
		System.out.println("Subtraction Result is: "+ c );
	}
	
	static void mul(int a, int b)
	{
		int c=a*b;
		System.out.println("Multiplication Result is: "+ c );
	}
	
	public void main(String[] args)
	{
	add(100,50);
	sub(300,200);
	mul(300,200);
}
}