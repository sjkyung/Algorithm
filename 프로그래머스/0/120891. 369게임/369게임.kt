class Solution {
    fun solution(order: Int): Int {
        val orderString = order.toString()
    
        var count = 0
        for (char in orderString) {
            if (char == '3' || char == '6' || char == '9') {
            count++
            }
        }
    
            return count
    }
}