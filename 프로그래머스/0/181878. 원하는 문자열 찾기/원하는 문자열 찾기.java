class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";
        String pt = "";
        for(int i=0; i<myString.length(); i++){
            char temp = myString.charAt(i);
            if('A'<=temp&&'Z'>=temp)
                temp += 32;
            str+=temp;
        }
        for(int i=0; i<pat.length(); i++){
            char temp = pat.charAt(i);
            if('A'<=temp&&'Z'>=temp)
                temp += 32;
            pt+=temp;
        }
        
        if(str.contains(pt))
            answer++;
        return answer;
    }
}