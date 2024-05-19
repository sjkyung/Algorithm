class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val result = mutableListOf<Int>()

        for (i in photo.indices) {
            var totalYearning = 0
            for (person in photo[i]) {
                val index = name.indexOf(person)
                if (index != -1) {
                    totalYearning += yearning[index]
                }
            }
            result.add(totalYearning)
        }

        return result.toIntArray()
    }
}