

package module1;

import java.util.Scanner;

public class Assignment58 {


	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the marks");
        int marks = input.nextInt();
        
        
        
		if(marks>90)
		{
				
			System.out.println("Grade A");
		
		}
		else if(marks>=75 && marks<=89)
		{
				
			System.out.println("Grade B");
		
		}
		else if(marks>=50 && marks<=74)
		{
				
			System.out.println("Grade C");
		
		}
		else if(marks<50)
		{
				
			System.out.println("Fail");
		
		}
		input.close();
			
}
}