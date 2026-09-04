package module1;

import java.util.Scanner;

public class Assignment54 {


	public static void main(String[] args)
	{

		System.out.println("Enter the age of the person");
		Scanner s1=new Scanner(System.in);
		int age=s1.nextInt();
		
		if(age>=60)
		{
			System.out.println("The person can avail senior citizen discount");
		}
		
		else
			System.out.println("The person can't avail senior citizen discount");
		
		s1.close();
			
}
}