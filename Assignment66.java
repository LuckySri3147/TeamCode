package module1;

import java.util.Scanner;

public class Assignment66 {


	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the marks");
        int marks = input.nextInt();
        
        if (marks>=0 && marks<=100)
        {

			if(marks>=90) // 90-100
			{	
				System.out.println("Grade A");
			}
			
			else if(marks>=75 && marks<90) // 75-89
			{	
				System.out.println("Grade B");
			}
			
			else if(marks<=74 && marks>=50) // 50-74
			{	
				System.out.println("Grade C");
			}
			
			 else
				{	
					System.out.println("fail");
				}
			input.close();
			
		}
 
       
        
 }
      
		
}
	
