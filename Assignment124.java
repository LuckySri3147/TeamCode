package module1;

 interface aaa
 {
	 abstract void b1(); 
	 abstract void b2();  
 }
 abstract class abc implements aaa
 {
	 abstract void b3(); 
	 abstract void b4();  
 }
 public class Assignment124 extends abc {
	 
	
	public static void main(String[] args)
	{                                
		Assignment124 a = new Assignment124();
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
	void b3() {
		// TODO Auto-generated method stub
		System.out.println("b3 method");	
	}

	@Override
	void b4() {
		System.out.println("b4 method");	
	}

	
	}





