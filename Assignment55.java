package module1;

import java.util.Scanner;


public class Assignment55 {
	
    public static void main(String[] args) {
      
    	
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();
        
        if(year%100==0)
        	System.out.println(year+" year is a century year");
        else
        	System.out.println(year+" year is not a century year");
        
        input.close();
    }
}
