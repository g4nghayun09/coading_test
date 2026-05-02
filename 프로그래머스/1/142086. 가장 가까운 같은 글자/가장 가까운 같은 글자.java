class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alphabet = new int[26];
        for(int i=0; i<alphabet.length; i++) {
            alphabet[i] = -1;
        }
        
        for(int i=0; i<s.length(); i++) {
            char word = (s.charAt(i));
            if(alphabet[word-'a']!=-1) {
                answer[i] = i - alphabet[word-'a'];
            }
            else {
                answer[i] = alphabet[word-'a'];
            }
            
            alphabet[word-97] = i;
        }
        return answer;
    }
}