class Solution {
    fun solution(n: Int, k: Int): Int { 
        var total = n * 12000 + k * 2000 
        var service = (n /10) * 2000
        return total - service 
    }
}