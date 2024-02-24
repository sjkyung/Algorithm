class Solution {
    public int solution(String t, String p) {
        int len = p.length();
        
        long num = Long.parseLong(p);
        
        int result = 0;
        
        for(int i = 0; i < t.length() - len + 1; i++){
            long f = Long.parseLong(t.substring(i,i+len));
            if(f <= num ) result++ ;
        }
        //t.length() - len 
        
        
        return result;
    }
}