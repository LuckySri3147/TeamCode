package module1;

import java.util.Scanner;

public class Assignment68 {


	public static void main(String[] args)
	{
		
		Scanner cred = new Scanner(System.in);
		System.out.println("enter the username");
        String username = cred.next();
        
        String username1="Admin";
        String password="123456";
        
        if (username1.equals(username))
        {
 
    		System.out.println("enter the password");
            String password1 = cred.next();

			if(password.equals(password1))
			{	
				System.out.println("Login successfully");
			}
			else
			{	
				System.out.println("Login failed");
			}
			
		}
       
        else
		{	
			System.out.println("Login failed as username is incorrect");
		}
 
       cred.close();
        
 }
      
		
}
	
