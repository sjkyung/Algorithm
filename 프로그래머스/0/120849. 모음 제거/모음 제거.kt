class Solution {
    fun solution(my_string: String): String {
        var answer = my_string.replace(Regex("[aeiou]"), "")
        return answer
    }
}