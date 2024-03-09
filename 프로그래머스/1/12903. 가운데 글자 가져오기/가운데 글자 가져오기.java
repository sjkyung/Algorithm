import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        
        if(arr.length  % 2 == 0){
            int index = arr.length / 2;
            answer += Character.toString(arr[index-1]);
            answer += Character.toString(arr[index]);
        }else{
            int index = arr.length / 2;
            answer = Character.toString(arr[index]);
        }
        
        
        return answer;
    }
}