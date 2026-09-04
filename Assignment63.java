package module1;

import java.util.Scanner;

public class Assignment63 {


	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num");
        int a = input.nextInt();
        
        switch(a)
        {
        case 1 : System.out.println("the day is sunday"); break;
        case 2 : System.out.println("the day is monday"); break;
        case 3 : System.out.println("the day is tuesday"); break;
        case 4 : System.out.println("the day is wednesday"); break;
        case 5 : System.out.println("the day is thursday"); break;
        case 6 : System.out.println("the day is friday"); break;
        case 7 : System.out.println("the day is saturday"); break;
        
        default: System.out.println("can't specify the day: error"); break;		
		}
        
        input.close();
		
}
	
}