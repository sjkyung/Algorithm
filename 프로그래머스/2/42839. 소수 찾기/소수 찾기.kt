class Solution {
    fun solution(numbers: String): Int {
        val primeSet = mutableSetOf<Int>()
        val numList = numbers.toCharArray().map { it.toString() }
        
        generatePermutations(numList, mutableListOf(), primeSet)
        return primeSet.count()
    }
    
    private fun generatePermutations(numbers: List<String>, 
                                     temp: MutableList<String>, 
                                     primeSet: MutableSet<Int>) {
        if (temp.isNotEmpty()) {
            val num = temp.joinToString("").toInt()
            if (isPrime(num)) {
                primeSet.add(num)
            }
        }
        
        for (i in numbers.indices) {
            val newList = numbers.toMutableList()
            val newTemp = temp.toMutableList()
            val removed = newList.removeAt(i)
            newTemp.add(removed)
            generatePermutations(newList, newTemp, primeSet)
        }
    }
    
    private fun isPrime(num: Int): Boolean {
        if (num <= 1) return false
        for (i in 2 until num) {
            if (num % i == 0) return false
        }
        return true
    }
}