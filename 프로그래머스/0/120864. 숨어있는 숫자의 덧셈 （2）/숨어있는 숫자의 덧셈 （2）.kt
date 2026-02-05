class Solution {
    fun solution(my_string: String): Int {
    return my_string
        .replace(Regex("[a-zA-Z]"), "+")   
        .split("+")                        
        .filter { it.isNotEmpty() }        
        .sumOf { it.toInt() }              
    }
}