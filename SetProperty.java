package module1;
import java.util.HashSet;
import java.util.Set;
public class SetProperty 
{
        public static void main(String[] args) 
        {
                        Set s1=                new HashSet();
                        s1.add("Hi");
                        s1.add("Hello");//2 ram will have the same hashcode values
                        s1.add("Hey");
                        s1.add("hi");
                        s1.add("Good");
                        s1.add(null);
                        System.out.println(s1);        
        }
}