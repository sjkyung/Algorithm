class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        int pCount = 0;
        int yCount = 0;

        for(int i=0; i < arr.length;i++){
            if(arr[i] == 'p' || arr[i] == 'P'){
                pCount += 1;
            }
            if(arr[i] == 'y' || arr[i] == 'Y'){
                yCount += 1;
            }
        }

        if(pCount == yCount){
            return answer;
        }
        
        
        return answer = false;
    }
}