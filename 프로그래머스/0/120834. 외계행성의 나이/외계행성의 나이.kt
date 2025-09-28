class Solution {
    fun solution(age: Int): String {
        return age.toString()
        .map { digit ->
            ('a'.code + (digit - '0')).toChar()
        }.joinToString("")
    }
}