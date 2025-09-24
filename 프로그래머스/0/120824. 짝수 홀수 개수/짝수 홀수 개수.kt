class Solution {
    fun solution(num_list: IntArray): IntArray {
        var evenCount = 0
        var oddCount = 0

        for (num in num_list) {
            if (num % 2 == 0) {
                evenCount++
            } else {
                oddCount++
            }
        }
        return intArrayOf(evenCount, oddCount)   
    }
}