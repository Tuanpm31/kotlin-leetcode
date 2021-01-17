class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        val hashMap = HashMap<Int, Int>()
        nums.forEach {
            hashMap[it] = hashMap.getOrDefault(it, 0) + 1
        }
        hashMap.forEach {
            if (it.value == 1) return it.key
        }
        return 0
    }
}

fun main() {
    val s = SingleNumber()
    println(s.singleNumber(intArrayOf(1)))
}