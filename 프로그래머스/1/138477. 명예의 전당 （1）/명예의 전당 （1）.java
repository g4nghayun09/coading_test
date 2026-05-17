import java.util.*;

class Solution { 
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<score.length; i++) {
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder());
            answer[i] = k-1<list.size() ? list.get(k-1) : list.get(list.size()-1);
        }
        
        
        return answer;
    }
}