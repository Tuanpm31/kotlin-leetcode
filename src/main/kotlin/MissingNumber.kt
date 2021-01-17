class MissingNumber {
    fun missingNumber(nums: IntArray): Int = (nums.size * (nums.size + 1)) / 2 - nums.sum()
}

fun main() {
    val s = MissingNumber()
    println(s.missingNumber(intArrayOf(9,6,4,2,3,5,7,0,1)))
}