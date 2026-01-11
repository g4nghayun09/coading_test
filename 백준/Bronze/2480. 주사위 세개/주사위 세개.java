import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dice1 = scan.nextInt();
        int dice2 = scan.nextInt();
        int dice3 = scan.nextInt();

        if(dice1 == dice2 && dice1 == dice3)
            System.out.println(10000+(dice1*1000));
        else if(dice1 == dice2 && dice1 != dice3){
            System.out.println(1000+(dice1*100));
        } else if(dice1 == dice3 && dice1 != dice2){
            System.out.println(1000+(dice1*100));
        } else if(dice2 == dice3 && dice2 != dice1){
            System.out.println(1000+(dice2*100));
        }
        else if(dice1 != dice2 && dice1 != dice3 && dice2 != dice3){
            int max = dice1;
            int[] diceArr = {dice1, dice2, dice3};
            for(int i=0; i<diceArr.length; i++){
                if(max<diceArr[i]){
                    max = diceArr[i];
                }
            }
            System.out.println(max*100);
        }
    }
}