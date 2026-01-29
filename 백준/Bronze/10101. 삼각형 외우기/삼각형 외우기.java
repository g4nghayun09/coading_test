import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int[] angle = new int[3];
        angle[0] = scan.nextInt();
        angle[1] = scan.nextInt();
        angle[2] = scan.nextInt();
        int sum = 0;

        for(int i=0; i<3; i++)
            sum += angle[i];
        if(sum == 180){
            if(angle[0] == angle[1] && angle[1] == angle[2])
                System.out.println("Equilateral");
            else if(angle[0] == angle[1] || angle[1] == angle[2] || angle[0] == angle[2])
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");

        } else {
            System.out.println("Error");
        }

    }
}