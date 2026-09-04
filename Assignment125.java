package module1;

 interface a3
 {
	 void b1(); 
	 void b2();  
 }
 interface a2 extends a3
 {
	 void b3(); 
	 void b4();  
 }
 public class Assignment125 implements a2 {
	 
	
	public static void main(String[] args)
	{                                
		Assignment125 a = new Assignment125();
		a.b1();
		a.b2();
		a.b3();
		a.b4();
	}	
		

	@Override
	public void b1() {
		// TODO Auto-generated method stub
		System.out.println("b1 method");	

	}

	@Override
	public void b2() {
		// TODO Auto-generated method stub
		System.out.println("b2 method");	

	}

	@Override
	public void b3() {
		// TODO Auto-generated method stub
		System.out.println("b3 method");	
	}

	@Override
	public void b4() {
		// TODO Auto-generated method stub
		System.out.println("b4 method");	
	}
	
	
	}





