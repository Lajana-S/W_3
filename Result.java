import java.util.Scanner;

/**
 * Question 2 : Grade Evaluator
 *
 * @author Lajana
 * @version v1.0
 */
public class Result
{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int m= scan.nextInt();
        scan.nextLine();
        String g;
        g = (m >= 40) ? ("Passed") : ("Failed");
        System.out.println("Your Result: \n You have got "+m+" marks.\t You have "+g);
    }
}