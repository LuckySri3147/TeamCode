package module1;

import java.util.Scanner;

public class Assignment50 {


	public static void main(String[] args)
	{

		Scanner s1=new Scanner(System.in);
		int age=s1.nextInt();
		
		if(age>=18)
		{
			System.out.println("The person can vote");
		}
		
		else
			System.out.println("The person can't vote");
		
		s1.close();
			
}
}