import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int min = scan.nextInt();
        int time = scan.nextInt();
        int allMin = min+time;

        System.out.println(((hour + allMin / 60) % 24)+" "+(allMin % 60));
    }
}