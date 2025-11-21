import java.util.Scanner;

/**
 * Pass or Fail
 *
 * @author Lajana
 * @version v1.0
 */
public class Result
{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks:");
        float m= scan.nextFloat();
        scan.nextLine();
        String g;
        g = (m >= 40) ? ("\u2192 Pass") : ("\u2192 Fail");
        System.out.println(g);
    }
}