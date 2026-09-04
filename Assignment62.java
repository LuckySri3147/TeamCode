package module1;

import java.util.Scanner;

public class Assignment62 {


	public static void main(String[] args)
	{
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("enter the selection");
        String sel = input1.next();
        
        switch(sel)
        {
        case "chrome" : System.out.println("chrome will be launched"); break;
        case "edge" : System.out.println("edge will be launched"); break;
        case "safari" : System.out.println("safari will be launched"); break;
        case "firefox" : System.out.println("firefox will be launched"); break;
        
        default: System.out.println("nothing will be launched"); break;
	
              
		
		}
        input1.close();
		
}
	
}