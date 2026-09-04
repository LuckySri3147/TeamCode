package module1;


public class Assignment79Child2 extends Assignment79Super {

	 int bonus=5000;
	 
		void bonus()
		{
		 int totalsalary=bonus+basicpay; 
		 
		 System.out.println("bonus is: "+bonus);
		 System.out.println("total pay is: "+totalsalary);
		}

	public static void main(String[] args)
	{
		System.out.println("child 2: ");
		Assignment79Child2 chh=new Assignment79Child2();
		chh.salary();  
		chh.bonus();
	}
	}



	

	
