class FindDuplicate {
    fun findDuplicate(nums: IntArray): Int {
        val min = nums.min()
        val max = nums.max()
        val sum = ((max!! + min!!) * (nums.size - 1)) / 2
        return nums.sum() - sum
    }
}

fun main() {
    val s = FindDuplicate()
    println(s.findDuplicate(intArrayOf(3, 1, 3, 4, 2)))
}