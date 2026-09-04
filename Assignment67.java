package module1;

import java.util.Scanner;

public class Assignment67 {


	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the salary");
        int salary = input.nextInt();
        
        if (salary>50000)
        {
    		System.out.println("enter the exp");
            int exp = input.nextInt();

			if(exp > 5)
			{	
				System.out.println("Eligible for bonus");
			}
			else
			{	
				System.out.println("not eligible for bonus");
			}
			
		}
        else
		{	
		 System.out.println("not eligible for bonus now");
		}
 
      input.close();
        
 }
      
		
}
	
