package module1;

public class Assignment38 {

	static int gv=55;
	int gv1=45;
	
	static void add()
	{
		int a=35;
		gv=30;
		
		Assignment38 assgn=new Assignment38();
	    assgn.gv1=65;
	    int kk=assgn.gv1;
		int newvar1=a+gv+kk;
		System.out.println("the global variable in static method: "+newvar1);
	}
	 
	 void sub()
	{
		 int k=100;
		 gv=20;
		 gv1=40;
		 int newvar2 = k+gv+gv1;
		System.out.println("the global variable in non static method: "+newvar2);
	}

	public static void main(String[] args)
	{
		add();
		Assignment38 assg=new Assignment38();
	    assg.sub();

}
}