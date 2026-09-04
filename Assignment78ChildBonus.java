package module1;


public class Assignment78ChildBonus extends Assignment78SuperSalary {

	 int bonus=3500;
	 
	void bonus()
	{
	 int totalsalary=bonus+basicpay; 
	 
	 System.out.println("bonus is: "+bonus);
	 System.out.println("total pay is: "+totalsalary);
	}
	

	public static void main(String[] args)
	{
		Assignment78ChildBonus chh=new Assignment78ChildBonus();
		chh.bonus();
		System.out.println("");
		chh.employee(); 
		System.out.println("");
		chh.salary();  
		
	}
	}



	

	
