class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Double = 0.0
        answer =  num1.toDouble() / num2.toDouble() * 1000
        return answer.toInt()
    }
}