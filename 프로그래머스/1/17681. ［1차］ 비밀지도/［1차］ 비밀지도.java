import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        int[][] map1 = new int[n][n];
        int[][] map2 = new int[n][n];
        Stack<Integer> stk = new Stack<>();
        
        for(int i=0; i<arr1.length; i++) {
            // 해당 수 이진수 구하기
            String binaryNum = Integer.toBinaryString(arr1[i]);
            if(binaryNum.length()!=n) {
                String temp = "";
                for(int j=0; j<n-binaryNum.length(); j++) {
                    temp+="0";
                }
                binaryNum = temp + binaryNum;
            }
            for(int j=0; j<binaryNum.length(); j++) {
                map1[i][j] = Integer.valueOf(binaryNum.charAt(j)-'0');
            }
            // 그리고 값 저장.
        }
        System.out.println(map2[0][1]);
        for(int i=0; i<arr2.length; i++) {
            // 해당 수 이진수 구하기
            String binaryNum = Integer.toBinaryString(arr2[i]);
            if(binaryNum.length()!=n) {
                String temp = "";
                for(int j=0; j<n-binaryNum.length(); j++) {
                    temp+="0";
                }
                binaryNum = temp + binaryNum;
            }
            for(int j=0; j<binaryNum.length(); j++) {
                map2[i][j] = Integer.valueOf(binaryNum.charAt(j)-'0');
            }
            // 그리고 값 저장.
        }
        for(int i=0; i<n; i++) {
            answer[i] = "";
            for(int j=0; j<n; j++) {
                if(map1[i][j]+map2[i][j]>0)
                    answer[i] += "#";
                else
                    answer[i] += " ";
            }
        }
        return answer;
    }
}