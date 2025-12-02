class Solution {
    fun solution(my_string: String): String {
       return my_string.map { ch ->
            when {
                ch.isUpperCase() -> ch.lowercaseChar() 
                ch.isLowerCase() -> ch.uppercaseChar()  
                else -> ch                              
            }
        }.joinToString("")
    }
}