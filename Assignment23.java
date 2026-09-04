package module1;

public class Assignment23 {

	  static void add()
	{
		System.out.println("static method 1");
	}
	
	
	  void add(int b)
	{
		System.out.println("non-static method 1");
	}
	
	public static void main(String[] args)
	{
		add();
		Assignment23 assg21=new Assignment23();
		assg21.add(5);
}
}