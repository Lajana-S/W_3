
/**
 * Question 4 : Default Value Checker
 *
 * @author Lajana
 * @version v1.0
 */
public class DefaultValues
{ 
    
        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        char g;
        boolean h;
    
    public static void main(String[] args){
        
        DefaultValues defaults = new DefaultValues();
        System.out.println("Byte default value : "+defaults.a);
        System.out.println("Short default value : "+defaults.b);
        System.out.println("Int default value : "+defaults.c);
        System.out.println("Long default value : "+defaults.d);
        System.out.println("Float default value : "+defaults.e);
        System.out.println("Double default value : "+defaults.f);
        System.out.println("Char default value : "+defaults.g);
        System.out.println("Boolean default value : "+defaults.h);
        
    }
}