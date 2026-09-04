package module1;
class B2
{
        B2(int a)
        {
                System.out.println("Constructor 1");
        }
        B2()
        {
                
                System.out.println("Constructor 2");
        }
}
public class B1 extends B2
{
        B1(int a,double b)
        {
                                System.out.println("Constructor 3");
        }
        B1()
        {
                this(100,23.4);
                System.out.println("Constructor 4");
        }
        public static void main(String[] args) 
        {
                new B1();
        }
}