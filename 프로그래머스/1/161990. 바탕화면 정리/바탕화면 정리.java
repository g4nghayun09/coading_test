class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int smallX = 99;
        int smallY = 0;
        int bigX = 0;
        int bigY = 0;
        
        // smallY구하기 - #이 어디에 있지
        for(int i=0; i<wallpaper.length; i++) {
            if(wallpaper[i].contains("#")) {
                smallY = i;
                break;
            }
        }
        
        // smallX구하기 - #이 있는 거
        for(int i=0; i<wallpaper.length; i++) {
            for(int j=0; j<wallpaper[i].length(); j++) {
                char ch = wallpaper[i].charAt(j);
                if(ch=='#' && smallX>j) {
                    smallX = j;
                }
            }
        }
        
        // bigY
        for(int i=wallpaper.length-1; i>=0; i--) {
            if(wallpaper[i].contains("#")) {
                bigY = i+1;
                break;
            }
        }
        
        // bigX
        for(int i=0; i<wallpaper.length; i++) {
            for(int j=0; j<wallpaper[i].length(); j++) {
                char ch = wallpaper[i].charAt(j);
                if(ch=='#' && bigX<=j) {
                    bigX = j+1;
                }
            }
        }
        answer[0] = smallY;
        answer[1] = smallX;
        answer[2] = bigY;
        answer[3] = bigX;
        return answer;
    }
}