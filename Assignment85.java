package module1;

 class Assignment85Grandparent {

	Assignment85Grandparent(double b)
	{
		
		System.out.println("Grandparent class for assg 85: ");
	}

}

 class Assignment85Super extends Assignment85Grandparent {
	
	Assignment85Super(int q)
	
	{ 
		super(67.88);
		System.out.println("Super class for assg 85: "+q);
	}
	
}


public class Assignment85 extends Assignment85Super {

	Assignment85(int k)
	
	{
	 super(222);
		System.out.println("child class for assg 85: "+k);
	}

	public static void main(String[] args)
	{
		new Assignment85(333);
		
	}
}



