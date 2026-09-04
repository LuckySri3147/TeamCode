package module1;

import java.util.Arrays;

class Assignment141 {
	
	public static void main(String[] args)
	{                                
		int in[]=new int[5];
		in[0]=10;
		in[1]=20;
		in[2]=30;
		in[3]=40;
		in[4]=50;
		
		
		double sum=0,avg;
		
		int i;
		for(i=0;i<in.length;i++)
		{
				sum=sum+in[i];
		}
		
		System.out.println("sum: "+sum);

		avg=sum/in.length;

		System.out.println("avg: "+avg);
}
}



