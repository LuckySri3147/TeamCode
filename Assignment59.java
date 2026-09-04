

package module1;

import java.util.Scanner;

public class Assignment59 {


	public static void main(String[] args)
	{
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("enter the num1");
        int num1 = input1.nextInt();
        
        Scanner input2 = new Scanner(System.in);
		System.out.println("enter the num2");
        int num2 = input2.nextInt();
        
        int max = Math.max(num1, num2);
		System.out.println("the max num bw "+num1+ " and " +num2+ " is "+max);
		input1.close();
		input2.close();	
}
}