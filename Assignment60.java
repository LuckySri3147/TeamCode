

package module1;

import java.util.Scanner;

public class Assignment60 {


	public static void main(String[] args)
	{
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("enter the units");
        int units = input1.nextInt();
        
        
        
        if(units<=100)
		{
        	int u=units*5;
        	System.out.println("currrent bill is " +u+ " Rupees");
		}
				
        else if(units>100)
		{
        	int u=units*10;
        	System.out.println("currrent bill is " +u+ " Rupees");
		}	
		
        input1.close();
		}
	
	
		
}