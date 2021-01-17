class FindDuplicate {
    fun findDuplicate(nums: IntArray): Int {
        val hashMap = HashMap<Int, Int>()
        nums.forEach {
            hashMap[it] = hashMap.getOrDefault(it, 0) + 1
        }
        val maxValue = hashMap.values.max()
        val keys = hashMap.filterValues { it == maxValue }.keys
        return keys.first()
    }
}

fun main() {
    val s = FindDuplicate()
    println(s.findDuplicate(intArrayOf(1,4,4,2,4)))
}