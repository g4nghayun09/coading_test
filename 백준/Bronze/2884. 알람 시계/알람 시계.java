import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int min = scan.nextInt();

        if(hour == 0&&min<45){
            int in = 60-(45-min);
            System.out.println(23+" "+in);
        }
        else if(min>=45){
            System.out.println(hour+" "+(min-45));
        }
        else {
            int in = 60-(45-min);
            System.out.println((hour-1)+" "+in);
        }
    }
}