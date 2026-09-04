package module1;

import java.util.Scanner;

public class Assignment57 {


	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num");
        int num = input.nextInt();
        
        
        
		if(num>10 && num<50)
		{
				
			System.out.println("num is in b/w 10 and 50");
		
		}
		else
			System.out.println("num is not in b/w 10 and 50");
		
			input.close();
}
}