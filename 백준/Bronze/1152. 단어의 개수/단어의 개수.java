import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String strTrim = str.trim();
        
        if(strTrim.isEmpty())
            System.out.println(0);
        else {
            String[] strArr = strTrim.split("\\s+");
            System.out.println(strArr.length);
        }
        
    }
}