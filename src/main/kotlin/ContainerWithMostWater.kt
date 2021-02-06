
class ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        var l = 0
        var r = height.size - 1
        var max = 0
        while (r > l) {
            val temp = min(height[l], height[r]) * (r - l)
            max = max(temp, max)
            if (height[l] < height[r]) {
                l ++
            } else {
                r --
            }
        }
        return max
    }

    private fun min(a: Int, b: Int): Int = if (a <= b) a else b
    private fun max(a: Int, b: Int): Int = if(a >= b) a else b
}

fun main() {
    val c = ContainerWithMostWater()
    c.maxArea(intArrayOf(1,2,1))
}
