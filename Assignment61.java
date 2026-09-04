package module1;

import java.util.Scanner;

public class Assignment61 {


	public static void main(String[] args)
	{
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("enter the selection");
        int a = input1.nextInt();
        
        switch(a)
        {
        case 1: System.out.println("option 1"); break;
        case 2: System.out.println("option 2"); break;
        case 3: System.out.println("option 3"); break;

        default: System.out.println("default option"); break;
	
              
		
		}
        input1.close();
		
}
	
}