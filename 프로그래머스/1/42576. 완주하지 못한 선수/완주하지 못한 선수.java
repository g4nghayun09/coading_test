import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        
        for(int i=0; i<completion.length; i++) {
            int value = map.get(completion[i]);
            map.put(completion[i], value-1);
        }
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        
        String answer = "";
        return answer;
    }
}