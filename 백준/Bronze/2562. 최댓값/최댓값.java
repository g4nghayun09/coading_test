import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArr = new int[9];
        int[] max = {0,0};
        for(int i = 0; i< numArr.length; i++){
            numArr[i] = scan.nextInt();
            if(numArr[i]>max[0]){
                max[0] = numArr[i];
                max[1] = i+1;
            }
        }
        System.out.println(max[0]);
        System.out.println(max[1]);
    }
}