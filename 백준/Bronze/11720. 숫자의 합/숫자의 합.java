import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        String num1 = scan.nextLine();
        String[] numArr = num1.split("");
        int answer = 0;
        for(int i=0; i< numArr.length; i++){
            answer += Integer.parseInt(numArr[i]);
        }
        System.out.println(answer);
    }
}