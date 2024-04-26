import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strNumbers = Arrays.stream(numbers).mapToObj(String::valueOf)
            .toArray(String[]::new);
        
        Arrays.sort(strNumbers, (a,b) -> (b + a).compareTo(a + b));
        
        StringBuilder sb = new StringBuilder();
        
        for(String num : strNumbers){
            sb.append(num);
        }
        
        String result = sb.toString();
        
        return result.startsWith("0") ? "0" : result;
    }
}