package module1;

import java.util.Scanner;

public class Assignment53 {


	public static void main(String[] args)
	{

		System.out.println("Enter the Principle");
		Scanner p=new Scanner(System.in);
		double Princ=p.nextDouble();
		
		System.out.println("Enter the Time");
		
		double Time=p.nextDouble();
		
		System.out.println("Enter the ROI");
		
		double Rate=p.nextDouble();
		
		double SI=(Princ*Time*Rate)/100;
		
		System.out.println("The Simple Interest is: "+SI);
		
		double SIn = Math.round(SI);
		
		if(SIn>1000)
		System.out.println("The Simple Interest is more than 1000");
		else
			System.out.println("The Simple Interest is less than 1000");
		
		p.close();

			
}
}