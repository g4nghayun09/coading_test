import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(str.equals("NLCS")){
            System.out.println("North London Collegiate School");
        } else if(str.equals("BHA")) {
            System.out.println("Branksome Hall Asia");
        } else if(str.equals("KIS")) {
            System.out.println("Korea International School");
        } else if(str.equals("SJA")) {
            System.out.println("St. Johnsbury Academy");
        }
    }
}