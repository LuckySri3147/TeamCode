package module1;

import java.util.Scanner;

public class Assignment65 {


	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
        int a = input.nextInt();
        
        switch(a)
        {
        case 1 : System.out.println("this is january"); break;
        case 2 : System.out.println("this is february"); break;
        case 3 : System.out.println("this is march"); break;
        case 4 : System.out.println("this is april"); break;
        case 5 : System.out.println("this is may"); break;
        case 6 : System.out.println("this is june"); break;
        case 7 : System.out.println("this is july"); break;
        case 8 : System.out.println("this is august"); break;
        case 9 : System.out.println("this is september"); break;
        case 10 : System.out.println("this is october"); break;
        case 11 : System.out.println("this is november"); break;
        case 12 : System.out.println("this is december"); break;

        
        default: System.out.println("can't specify the year: error"); break;		
		}
        input.close();
		
}
	
}