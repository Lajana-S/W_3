import java.util.Scanner;

/**
 * Question 6 : Rickshaw Fare
 *
 * @author Lajana
 * @version v1.0
 */
public class RickshawFare
{
    public static void main(String[] args){
        
        int fare = 30;
        double k;
        double m;
        int dis;
        int ni;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("             Enter Details :             ");
        System.out.println("     -------------------------------     ");
        
        System.out.println("Enter the distance in km :");
        k = scan.nextDouble();
        scan.nextLine();
        
        System.out.println("Enter the time in min :");
        m = scan.nextDouble();
        scan.nextLine();
        
        
        System.out.println("Are you a local? (YES/NO)");
        String l = scan.next();
        
        dis = (l.equals("YES") || l.equals("yes") || k >= 80) ? 25 : 0; //l=="YES" compares the memory place
        
        System.out.println("Is it a night-time travel? (YES/NO)");
        String n = scan.next();
        
        ni = (n.equals("YES") || n.equals("yes")) ? 50 : 0;
        
        double km = 5.5 * k;
        double min = 1.23 * m;
        double t = fare + km + min;
        double night = ni * t / 100;
        double to = t + night;
        double discount = dis * to / 100;
        double total = to - discount;
        
        System.out.println("");
        System.out.println("      -----------------------------      ");
        
        System.out.println("");
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");
        System.out.println("Base Fare         : Rs."+fare);
        System.out.println("Distance          : "+k+" km");
        System.out.println("Time              : "+m+" mins");
        System.out.println("Local             : "+l);
        System.out.println("Night-time Travel : "+n);
        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.println("Base Fare              : Rs."+fare);
        System.out.println("Kilo-meter Fare        : Rs."+km);
        System.out.println("Minute Fare            : Rs."+min);
        System.out.println("Night-time Travel Fare : Rs."+night);
        System.out.println("     -------------------------------     ");       
        System.out.println("Net Fare               : Rs."+to);
        System.out.println("     -------------------------------     ");
        System.out.println("Discount               : Rs."+discount);
        System.out.println("     -------------------------------     ");
        System.out.println("Total with Discount    : Rs."+total);
        System.out.println("");
        System.out.println("=========================================");
        
    }
}