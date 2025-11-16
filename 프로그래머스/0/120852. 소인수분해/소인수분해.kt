class Solution {
    fun solution(n: Int): IntArray {
        var answer = mutableListOf<Int>()
        var num = n
        var divisor = 2

        while (num >= divisor * divisor) {
            if (num % divisor == 0) {
                answer.add(divisor)
                while (num % divisor == 0) {
                    num /= divisor
                }
            }
            divisor++
        }

        if (num > 1) answer.add(num)
        return answer.sorted().toIntArray()
    }
}