class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        String temp1 = "";
        int lo = 0;
        int cnt=0;
        for(int i=0; i<intStrs.length; i++){
            temp1="";
            for(int j=s; j<l+s; j++){
                char temp = intStrs[i].charAt(j);
                temp1 += temp;
            }
            lo = Integer.parseInt(temp1);
            if(lo>k){
                cnt++;
            }
        }
        System.out.print(temp1);
        int[] answer = new int[cnt];
        cnt=0;
        for(int i=0; i<intStrs.length; i++){
            temp1="";
            for(int j=s; j<l+s; j++){
                char temp = intStrs[i].charAt(j);
                temp1 += temp;
            }
            lo = Integer.parseInt(temp1);
            if(lo>k){
                answer[cnt]=lo;
                cnt++;
            }
        }
        return answer;
    }
}