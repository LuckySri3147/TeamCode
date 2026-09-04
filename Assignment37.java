package module1;

public class Assignment37 {

 
   static int a = 10;
   int b = 20;

   
    static void staticMethod() {
        System.out.println("staic global variable a: " + a);
        
        Assignment37 assg = new Assignment37();
        System.out.println("non staic global variable b: " + assg.b);
    }


    void nonStaticMethod() {
        System.out.println("staic global variable a: " + a);
        System.out.println("non staic global variable b: " +b);
    }

    public static void main(String[] args) {
        staticMethod();

        Assignment37 assg38 = new Assignment37();
        assg38.nonStaticMethod();
    }
}
