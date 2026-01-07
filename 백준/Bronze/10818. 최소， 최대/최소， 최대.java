import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num = Integer.parseInt(scan.nextLine());
            String arrayNum = scan.nextLine();
            String[] array = arrayNum.split(" ");
            int[] arrayInt = new int[num];
            for(int i=0; i<num; i++){
                arrayInt[i] = Integer.parseInt(array[i]);
            }

            int min = arrayInt[0];
            int max = arrayInt[0];
            for (int i = 1; i < arrayInt.length; i++) {
                max = Math.max(max, arrayInt[i]); // max와 현재 요소 중 큰 값
                min = Math.min(min, arrayInt[i]); // min과 현재 요소 중 작은 값
            }
            System.out.println(min+" "+max);
        }
    }