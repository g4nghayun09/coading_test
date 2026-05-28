import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] supoja1 = {1, 2, 3, 4, 5};
        int[] supoja2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = {0, 0, 0};
        for(int i=0; i<answers.length; i++) {
            if(answers[i]==supoja1[i%supoja1.length])
                scores[0]++;
            if(answers[i]==supoja2[i%supoja2.length])
                scores[1]++;
            if(answers[i]==supoja3[i%supoja3.length])
                scores[2]++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        for(int i=0; i<scores.length; i++) {
            if(max<scores[i]) {
                max = scores[i];
            }
        }
        for(int i=0; i<scores.length; i++) {
            if(max==scores[i]) {
                list.add(i+1);
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}