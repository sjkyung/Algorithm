class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var answer: Int = (2 * (k-1)) % numbers.size
        return numbers[answer]
    }
}