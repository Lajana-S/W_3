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
        
        dis = (l == "YES" || l == "yes"|| k >= 80) ? (45) : (0);
        
        System.out.println("Is it a night-time travel? (YES/NO)");
        String n = scan.next();
        
        ni = (n == "YES" || n == "yes") ? (50) : (0);
        
        double km = 5.5 * k;
        double min = 1.23 * m;
        double net = fare + km + min;
        double night = ni * net * 0.01;
        double to = net + night;
        double discount = dis * to * 0.01;
        double total = to - discount;
        
        System.out.println("");
        System.out.println("      -----------------------------      ");
        
        System.out.println("");
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");
        System.out.println("Base Fare : Rs."+fare);
        System.out.println("Distance : "+k+"km");
        System.out.println("Time : "+m+"min");
        System.out.println("Local : "+l);
        System.out.println("Night-time Travel : "+n);
        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.println("Base Fare              : Rs."+fare);
        System.out.println("Km Fare                : Rs."+km);
        System.out.println("Min Fare               : Rs."+min);
        System.out.println("Net Fare               : Rs."+net);
        System.out.println("     -------------------------------     ");
        System.out.println("Night-time Travel Fare : Rs."+night);
        System.out.println("     -------------------------------     ");
        System.out.println("Discount               : Rs."+discount);
        System.out.println("     -------------------------------     ");
        System.out.println("Total with Discount    : Rs."+total);
        System.out.println("");
        System.out.println("=========================================");
        
    }
}