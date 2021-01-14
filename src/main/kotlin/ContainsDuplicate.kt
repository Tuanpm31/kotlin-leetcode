class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        nums.sort()
        nums.forEachIndexed { index, value ->
            if (nums.binarySearch(value) != index) return true
        }
        return false
    }
}

fun main() {
    val s = Solution()
    println(s.containsDuplicate(intArrayOf(1, 2, 3, 1)))
}