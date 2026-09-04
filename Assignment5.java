package module1;

public class Assignment5 {

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
	
	static void mul()
	{
		System.out.println("Multiplication Result");
	}
	
	static void div()
	{
		System.out.println("Division Result");
	}
	
	public void main(String[] args)
	{
	add(100,50);
	sub(300,200);
	mul();
	div();
}
}