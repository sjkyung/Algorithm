class Solution {
    fun solution(n: Int): Int {
        var i = 1
        var fact = 1

        while (fact * (i + 1) <= n) {
            i++
            fact *= i
        }
        return i
    }
}