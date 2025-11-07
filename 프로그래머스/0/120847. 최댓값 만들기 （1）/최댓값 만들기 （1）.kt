class Solution {
    fun solution(numbers: IntArray): Int {
        numbers.sort()
        val n = numbers.size
        return numbers[n - 1] * numbers[n - 2]
    }
}