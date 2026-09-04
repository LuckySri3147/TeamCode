package module1;
import java.util.Scanner;
public class Assignment30 {

	 
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		
	    int a = s1.nextInt();
		System.out.println("int: "+a);
		 
		long b = s1.nextLong();
		System.out.println("long: "+b);
		 
		byte c = s1.nextByte();
		System.out.println("byte: "+c);
		
		short d = s1.nextShort();
		System.out.println("short: "+d);
		 
		float e = s1.nextFloat();
		System.out.println("float: "+e);
		
		double f = s1.nextDouble();
		System.out.println("double: "+f);
		
		boolean g = s1.nextBoolean();
		System.out.println("boolean: "+g); 
		
		String i = s1.next();
		System.out.println("char: "+i);
		
		s1.nextLine(); // buffer will be cleared
		
		String h = s1.nextLine();
		System.out.println("string: "+h);
		
		s1.close();
		
}
}