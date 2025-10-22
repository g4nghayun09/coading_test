class Solution {
    public int[] solution(String myString) {
        int cnt=0;
        if(myString.charAt(myString.length()-1)=='x')
            cnt++;
        
        int[] answer = {};
        String[] str = myString.split("x");
        answer = new int[str.length+cnt];
        for(int i=0; i<str.length; i++){
            answer[i] = str[i].length();
        }
        System.out.print(myString);
        return answer;
    }
}