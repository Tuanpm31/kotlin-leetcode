fun main() {
    val nums = intArrayOf(-2, 1, 1)
    val l = 0
    val r = nums.size - 1
    println(l)
    println(r)
    val sumWithOutLeft = nums.copyOfRange(l + 1, r).toList()
    val sumWithOutRight = nums.copyOfRange(l, r - 1).toList()

    println(sumWithOutLeft)
    println(sumWithOutRight)
    println(nums.copyOfRange(1, 3).toList())
}