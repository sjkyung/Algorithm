class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var number3 = (numer1 * denom2)+(numer2*denom1)
        var denom3 = denom1 * denom2
        var min =1 
        
        for( i in min..number3){
            if(number3 % i == 0 && denom3 % i == 0){
                min = i
            }
        }
        
        
        

        var answer: IntArray = intArrayOf(number3/min,denom3/min)
        return answer
    }
}