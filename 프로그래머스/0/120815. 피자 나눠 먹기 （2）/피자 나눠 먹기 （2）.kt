class Solution {
    fun solution(n: Int): Int {
        for (i in 1..100) {
            if ((6 * i) % n == 0) 
            return i
        
        }
        
        return 0
    }
}