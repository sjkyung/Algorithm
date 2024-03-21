import java.util.*;


class Solution {
    public int[] solution(String s) {
        int transformCount = 0; 
        int removedZero = 0; 

        while (!s.equals("1")) {
            int lengthBefore = s.length();
            
          
            s = s.replaceAll("0", "");
            int lengthAfter = s.length();
            removedZero += (lengthBefore - lengthAfter);
            
            s = Integer.toBinaryString(lengthAfter);
            
            transformCount++;
        }

        return new int[] {transformCount, removedZero};
    }
}