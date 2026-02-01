import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            String angleStr = scan.nextLine();
            String[] angleArr = angleStr.split(" ");
            if(angleArr[0].equals("0") && angleArr[1].equals("0") && angleArr[2].equals("0"))
                break;
            int[] Arr = {Integer.parseInt(angleArr[0]), Integer.parseInt(angleArr[1]), Integer.parseInt(angleArr[2])};
            Arrays.sort(Arr);

            if(Arr[2]>=Arr[1]+Arr[0]){
                System.out.println("Invalid");
            } else {
                if(Arr[0] == Arr[1] && Arr[0] == Arr[2])
                    System.out.println("Equilateral");
                    // 두변의 길이가 같을 때
                else if(Arr[0] == Arr[1] || Arr[0] == Arr[2] || Arr[1] == Arr[2])
                    System.out.println("Isosceles");
                else
                    System.out.println("Scalene");
            }

        }

    }
}