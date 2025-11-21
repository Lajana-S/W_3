
/**
 * Tutorial_3
 *
 * @author Lajana
 * @version v1.0
 */
public class T_3
{
    int age;//instance variable
    static int qty;//static veriable
    public static void main(String[] args){
        
    //implicit typecasting 
    int n1=1;//local variable
    System.out.println(n1); 
    double dt=n1;
    System.out.println(dt);
    
    //explicit typecasting
    double l=500;
    System.out.println(l);
    int bt=(int)l;
    System.out.println(bt);
    
    //finding min, max, siz and bytes
    System.out.println(Byte.MAX_VALUE);//returns max value
    System.out.println(Byte.MIN_VALUE);// returns min value
    System.out.println(Byte.SIZE);//returns bits
    System.out.println(Byte.BYTES);//returns bytes

    //escape sequence
    System.out.println("Hello\nWorld");//new line
    System.out.println("Hamro\tNepal");//tab
    System.out.println("he said, \"Hi\"");//double quotation
    System.out.println("\'Bye\'");//single quotation
    
    //unicode escape sequence
    System.out.println("\u2764");//heart emoji
    }
}