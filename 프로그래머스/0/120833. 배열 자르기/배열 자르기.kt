class Solution {
    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
        var answer: IntArray = intArrayOf()
        answer = numbers.sliceArray(num1 until num2 + 1)
        return answer
    }
}