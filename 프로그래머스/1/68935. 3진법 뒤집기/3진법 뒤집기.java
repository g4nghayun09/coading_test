class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        while(true) {
            str += n%3;
            n /= 3;
            if(n==0)
                break;
        }
        for(int i=0; i<str.length(); i++) {
            answer +=(int)(Math.pow(3, i)) * (str.charAt(str.length()-i-1)-48);
            System.out.println(Math.pow(3, i));
        }
        
        return answer;
    }
}