package module1;


public class Assignment79Child3 extends Assignment79Super {

	 int bonus=7000;
	 
		void bonus()
		{
		 int totalsalary=bonus+basicpay; 
		 
		 System.out.println("bonus is: "+bonus);
		 System.out.println("total pay is: "+totalsalary);
		}
		
	public static void main(String[] args)
	{
		System.out.println("child 3: ");
		Assignment79Child3 chh=new Assignment79Child3();
		chh.salary();  
		chh.bonus();
	}
	}



	

	
