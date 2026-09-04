package module1;

import java.util.Arrays;

class Assignment135 {
	
	public static void main(String[] args)
	{                                
		String na[]=new String[5];
		na[0]="qwe1";
		na[1]="qwe2";
		na[2]="qwe3";
		na[3]="qwe4";
		na[4]="qwe5";
		
		System.out.println(Arrays.toString(na));

		for(int i=0;i<na.length;i++)
		{
				System.out.println("roll no: "+i+", name: "+na[i]);
		}
		
		
	}

}



