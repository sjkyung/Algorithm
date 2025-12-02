class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        
        val char = my_string.toCharArray()
        var temp = char[num1]
        char[num1] = char[num2]
        char[num2] = temp

        
        return String(char)
    }
}