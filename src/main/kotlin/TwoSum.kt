class TwoSum {
//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        val l = 0
//        val r = nums.size - 1
//        while (l <= r) {
//            when {
//                (nums[l] + nums[r]) == target -> {
//                    return intArrayOf(l, r)
//                }
//                (nums[l] + nums[r]) > target -> {
//                    l + 1
//                }
//                else -> {
//                    r - 1
//                }
//            }
//        }
//        return intArrayOf(0, 0)
//    }
}

fun main() {
    val s = TwoSum()
    println(s.twoSum(intArrayOf(2,7,11,15), 9))
}