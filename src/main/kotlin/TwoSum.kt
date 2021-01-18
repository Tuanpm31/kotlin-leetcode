class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = HashMap<Int, Int>()
        nums.forEachIndexed { index, value ->
            hashMap[value] = index
        }
        nums.forEachIndexed { index, i ->
            val diff = target - i
            hashMap[diff]?.let {
                if (it != index) return intArrayOf(index, it)
            }
        }
        return intArrayOf(0, 0)
    }
}

fun main() {
    val s = TwoSum()
    println(s.twoSum(intArrayOf(2,7,11,15), 9).toList())
}