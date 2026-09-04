package module1;

import java.util.Scanner;

public class Assignment32 {

	public static void main(String[] args)
	{
   
		Scanner s1=new Scanner(System.in);
		
	//circle
	System.out.println("radius:");
	int r = s1.nextInt();
	
	double areac=Math.PI*r*r;
	System.out.println("area of the circle: "+areac);
	
	double Circumferencec=2*Math.PI*r;
	System.out.println("circumference of the circle: "+Circumferencec);

    //square
	System.out.println("side:");
	int side = s1.nextInt();
	
    int areas=side*side;
    System.out.println("area of the square: "+areas);
    
    int Circumferences=4*side;
    System.out.println("Circumference of the square : "+Circumferences);
    
    //triangle
	System.out.println("b:");
	int b = s1.nextInt();
	
	System.out.println("h:");
	int h = s1.nextInt();
	
    double areat=b*h*0.5;
    System.out.println("area of the triangle: "+areat);
    
	System.out.println("a:");
	int a = s1.nextInt();
	
	System.out.println("c:");
	int c = s1.nextInt();
	
    int Perimeter=a+b+c;
    System.out.println("perimeter of the triangle: "+Perimeter);
    
    //rectangle
	System.out.println("length:");
	int length = s1.nextInt();
	
	System.out.println("breadth:");
	int breadth = s1.nextInt();
	
    int arear=length*breadth;
    System.out.println("area of the rectangle: "+arear);
    
    int Perimeterr=2*(length+breadth);
    System.out.println("perimeter of the rectangle: "+Perimeterr);
    
    s1.close();
}
}