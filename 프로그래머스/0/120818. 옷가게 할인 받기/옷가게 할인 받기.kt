class Solution {
    fun solution(price: Int): Int {
        var answer: Int = 0
        
        
        if( price < 300000  && price >= 100000){
            answer = (price.toDouble() * 0.95).toInt()
        }else if( price < 500000 && price >= 300000){
                answer = (price.toDouble() * 0.9).toInt()
        }else if(price >= 500000 ){
            answer = (price.toDouble() * 0.8).toInt()
        }else{
            answer = price
        }
        
        return answer
    }
}