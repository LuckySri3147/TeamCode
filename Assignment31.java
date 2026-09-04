package module1;

public class Assignment31 {

	public static void main(String[] args)
	{
   
    //circle
	int r=100;
    double areac=Math.PI*r*r;
    System.out.println("area of the circle: "+areac);
    double Circumferencec=2*Math.PI*r;
    System.out.println("circumference of the circle: "+Circumferencec);

    //square
    int side=20;
    int areas=side*side;
    System.out.println("area of the square: "+areas);
    int Circumferences=4*side;
    System.out.println("Circumference of the square : "+Circumferences);
    
    //triangle
    int b=20,h=10;
    double areat=b*h*0.5;
    System.out.println("area of the triangle: "+areat);
    int a=15,c=25;
    int Perimeter=a+b+c;
    System.out.println("perimeter of the triangle: "+Perimeter);
    
    //rectangle
    int len=20,bre=10;
    int arear=len*bre;
    System.out.println("area of the rectangle: "+arear);
    int Perimeterr=2*(len+bre);
    System.out.println("perimeter of the rectangle: "+Perimeterr);
    
    
}
}