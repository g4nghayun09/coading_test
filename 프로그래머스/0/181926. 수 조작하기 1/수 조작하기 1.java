class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for(int i=0; i<control.length(); i++){
            char temp = control.charAt(i);
            if(temp=='w')
                n++;
            if(temp=='s')
                n--;
            if(temp=='d')
                n+=10;
            if(temp=='a')
                n-=10;
        }
        answer = n;
        return answer;
    }
}