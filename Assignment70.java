package module1;

import java.util.Scanner;

public class Assignment70 {


	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please specify the marks");
        int marks = sc.nextInt();
        
        
        if (marks>=0 && marks<=100)
        {
        	if(marks>90)
        	{
        		System.out.println("please specify the marks of maths");
                int maths = sc.nextInt();
                System.out.println("please specify the marks of science");
                int science = sc.nextInt();
                
        		if(maths>90 && science>90)
        		{
        			System.out.println("Grade A+");
        		}
        		else
        		{
        			System.out.println("Grade A");
      
        		}
        	}
        	
        	else if(marks<=90 && marks>80)
        	{
        		System.out.println("please specify the marks of maths");
        		int maths = sc.nextInt();
        		 System.out.println("please specify the marks of science");
                int science = sc.nextInt();
        		if(maths>90 && science>90)
        		{
        			System.out.println("Grade B+");
        		}
        		else
        		{
        			System.out.println("Grade B");
      
        		}
        	}
        	else if(marks<=80 && marks>50)
        		System.out.println("Grade C");
        	
        	else 
        	{
        		System.out.println("fail");
        	}
    		
    		sc.close();
    		
        
 }
        else
        	System.out.println("invalid input");
      
		
	}
}

	

	
