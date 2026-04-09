class Solution {
    fun solution(chicken: Int): Int {
            var coupons = chicken
            var service = 0

            while (coupons >= 10) {
                val newChicken = coupons / 10     
                service += newChicken              
                coupons = coupons % 10 + newChicken 
            }

            return service
    }
}