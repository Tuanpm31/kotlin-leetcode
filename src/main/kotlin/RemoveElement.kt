class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        return nums.filter { it != `val` }.size
    }
}

fun main() {
    val s = RemoveElement()
    println(s.removeElement(intArrayOf(0,1,2,2,3,0,4,2), 2))
}