class MaximumSubArray {
    fun maxSubArray(nums: IntArray): Int {
        var currentMax = Int.MIN_VALUE
        for (i in nums.indices) {
            var runningWindowSum = 0
            for (j in i until nums.size) {
                runningWindowSum += nums[j]
                currentMax = max(runningWindowSum, currentMax)
            }
        }
        return currentMax
    }

    private fun max(a: Int, b: Int) = if (a >= b) a else b
}

fun main() {
    val s = MaximumSubArray()
    println(s.maxSubArray(intArrayOf(-2, -3, -1)))
}