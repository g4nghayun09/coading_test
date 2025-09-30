class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char temp = 0;
        String div = "";
        for(int i=0; i<myString.length()-pat.length()+1; i++){
            div="";
            for(int j=i; j<pat.length()+i; j++){
                temp = myString.charAt(j);
                div+=temp;
            }
            System.out.println(div);
            if(div.equals(pat)){
                answer++;
            }
        }
        return answer;
    }
}