import java.util.*;
import java.util.stream.Stream;

class Solution {
    public String solution(String s) {
        String answer = "";
        int[] digits = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(digits);
        answer += String.valueOf(digits[0]) + " " + String.valueOf(digits[digits.length-1]);
        
        return answer;
    }
}