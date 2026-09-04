package module1;

import java.util.Arrays;

class Assignment138 {
	
	public static void main(String[] args)
	{                                
		String in[]=new String[5];
		in[0]="qwe1";
		in[1]="qwe2";
		in[2]="qwe3";
		in[3]="qwe4";
		in[4]="qwe5";
		
		String out[]=new String[in.length];
		
		int i,j;
		for(i=0, j=4;i<in.length;j--,i++)
		{
				out[j]=in[i];
		}
		
		System.out.println(Arrays.toString(in));
		System.out.println(Arrays.toString(out));
	}

}



