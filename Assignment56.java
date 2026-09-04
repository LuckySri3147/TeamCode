package module1;

import java.util.Scanner;

public class Assignment56 {


	public static void main(String[] args)
	{
		int k=0;
		Scanner input = new Scanner(System.in);
		System.out.println("how many nums do you want to enter");
        int num = input.nextInt();
        
        
		for(int i=1;i<=num;i++)
		{
				
			k= k+i;
		
		}
		System.out.println("sum of " +num+ " numbers is: "+k);
		input.close();
			
}
}