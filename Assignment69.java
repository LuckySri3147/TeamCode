package module1;

import java.util.Scanner;

public class Assignment69 {


	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please specify the gender");
        String gender = sc.next();
        
        
        if (gender.equals("female"))
        {
        
    		System.out.println("enter the female has aadhaar card or not");
            Boolean haveaadhaar = sc.nextBoolean();

			if(haveaadhaar)
			{	
				System.out.println("Free travel availed");
			}
			else if(!haveaadhaar)
			{	
				System.out.println("gender matching but no aadhaar so no free travel - have to pay full price for the ticket");
			}
			
		}
        
       
        else if (gender.equals("male"))
		{	
       
    		System.out.println("enter the person's age");
            int age1 = sc.nextInt();

            if(age1>=60)
			{	
				System.out.println("sr citizen benefit availed so only 50% of the ticket price");
			}
			else 
			{	
				System.out.println("male but not sr citizen, so collect full price of the ticket");
			}
		}
        
        else if(gender.equals("kids"))
        {
  
		System.out.println("enter the kid's age");
        int kids = sc.nextInt();

        if(kids<5)
		{	
			System.out.println("free travel as the age of the kid is 5 years below");
		}
		else if(kids>=5 && kids<=10)
		{	
			System.out.println("kid so only 10% of the ticket price");
		}
	}
        
        else
        {
        	System.out.println("invalid input");
        }
 
       sc.close();
        
 }
      
		
}
	

	
