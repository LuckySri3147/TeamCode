package module1;

 interface aa
 {
	 void b1(); 
	 void b2();  
 }
 abstract class ab implements aa
 {
	 abstract void b3(); 
	 abstract void b4();  
 }
 public class Assignment126 extends ab {
	 
	
	public static void main(String[] args)
	{                                
		Assignment126 a = new Assignment126();
		a.b1();
		a.b2();
		a.b3();
		a.b4();
	}

	@Override
	public void b1() {
		// TODO Auto-generated method stub
		System.out.println("b1");	
	}

	@Override
	public void b2() {
		// TODO Auto-generated method stub
		System.out.println("b2");	
	}

	@Override
	void b3() {
		// TODO Auto-generated method stub
		System.out.println("b3");	
	}

	@Override
	void b4() {
		// TODO Auto-generated method stub
		System.out.println("b4");	
	}	
		

	
	
	}





