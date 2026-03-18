class Solution {
    public String[] solution(String[] picture, int k) {
        // 세로 갯수
        String[] answer = new String[picture.length*k];
        int idx = 0;
        
        // 한줄늘리는 코드
        for(int i=0; i<picture.length; i++) {
            String row = "";
            // 초기화
            answer[idx] = "";
            for(int j=0; j<picture[i].length(); j++) {
                for(int d=0; d<k; d++) {
                    row += picture[i].charAt(j);
                }
            }
            // 늘린코드복사
            for(int d=0; d<k; d++) {
                    answer[idx] = row;
                    idx++;
                }
        }
        return answer;
    }
}