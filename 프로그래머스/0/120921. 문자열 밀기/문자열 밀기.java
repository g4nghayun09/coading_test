class Solution {
    public int solution(String A, String B) {
        String a = A;
        int cnt=0;
        if(A.equals(B))
            return 0;
        
        else if(A.length()==B.length()){
            for(int i=1; i<A.length(); i++){
                a = a.charAt(a.length()-1) + a.substring(0,a.length()-1);
                if(a.equals(B))
                    return i;
            }
        }
        return -1;
    }
}