class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        for(int i=0; i<babbling.length; i++) {
            for(int j=0; j<words.length; j++) {
                if(babbling[i].contains(words[j])) {
                    String str = babbling[i].replace(words[j], " ");
                    babbling[i] = str;
                }
            }
            if(babbling[i].replace(" ", "").equals("")) 
                answer++;
        }
        return answer;
    }
}