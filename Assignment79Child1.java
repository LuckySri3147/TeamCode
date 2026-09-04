package module1;


public class Assignment79Child1 extends Assignment79Super {

	 int bonus=3500;
	 
		void bonus()
		{
		 int totalsalary=bonus+basicpay; 
		 
		 System.out.println("bonus is: "+bonus);
		 System.out.println("total pay is: "+totalsalary);
		}

	public static void main(String[] args)
	{
		System.out.println("child 1: ");
		Assignment79Child1 chh=new Assignment79Child1();
		chh.salary(); 
		chh.bonus();
		
	}
	}



	

	
