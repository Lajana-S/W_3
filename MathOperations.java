
/**
 * Operations
 *
 * @author Lajana
 * @version v1.0
 */
public class MathOperations
{
    public static void main(String[] args){
        
        System.out.println("Arithmetic Operators:");
        int x=10, y=2;
        int a=x+y;
        int b=x-y;
        int c=x*y;
        int d=x/y;
        System.out.println("add="+a+"\tsubtract="+b+"\tmultiply="+c+"\tdivide="+d);
        System.out.println("");
        
        System.out.println("Unary Operators:");
        int a0=3;
        System.out.println("a ="+a0);
        int a1=a0++;
        System.out.println("a++ ="+a1);
        int a2=++a0;
        System.out.println("++a ="+a2);
        
        int b0=3;
        System.out.println("b ="+b0);
        int b1=b0--;
        System.out.println("b-- ="+b1);
        int b2=--b0;
        System.out.println("--b ="+b2);
        System.out.println("");
        
        System.out.println("Assignment Operator:");
        int z=12;
        System.out.println("z has the value "+z);
        System.out.println("");
        
        System.out.println("Relational Operators:");
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println("");
        
        System.out.println("Logical Operators:");
        Boolean e=true, f=false;
        System.out.println(!e);
        System.out.println(e && f);
        System.out.println(e || f);
        System.out.println("");
        
        System.out.println("Ternary Operators:");
        int larger;
        larger= (a>b) ? a : b;
        System.out.println(larger+" is greater number.");
        
    }
}