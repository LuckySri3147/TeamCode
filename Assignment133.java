package module1;

import java.util.Arrays;
import java.util.Scanner;

class Assignment133 {
	
	public static void main(String[] args)
	{                                
		Scanner s=new Scanner(System.in);
		int [] roll=new int[s.nextInt()];
		
		for(int i=0;i<=roll.length-1;i++)
		{
			System.out.println("roll no"+i);
				roll[i]=s.nextInt();
		}
		
			System.out.println(Arrays.toString(roll));

		
	}

}



