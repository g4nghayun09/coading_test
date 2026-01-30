import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int afternoon = scan.nextInt();
        int dinner = scan.nextInt();
        int height = scan.nextInt();

        int day = (height - afternoon + (afternoon - dinner) - 1)
                / (afternoon - dinner) + 1;
        System.out.println(day);
    }
}