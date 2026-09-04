package module1;

import java.util.Scanner;

public class Assignment51 {


	public static void main(String[] args)
	{

		Scanner s1=new Scanner(System.in);
		int num=s1.nextInt();
		
		if(num%2==0)
		{
			System.out.println("num is even");
		}
		
		else
			System.out.println("num is odd");
		
		s1.close();
			
}
}