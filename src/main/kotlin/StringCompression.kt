class StringCompression {
    fun compress(chars: CharArray): CharArray {
        val result = mutableListOf<Char>()
        var currentChar: Char = chars.first()
        var currentCount = 0
        chars.forEach {
            if (currentChar == it) {
                currentCount += 1
            } else {
                if (result.isEmpty()) {
                    result.add(currentCount.toString().first())
                    result.add(chars.first())
                    currentCount = 0
                    currentChar = it
                } else {
                    result.add(currentCount.toString().first())
                    result.add(currentChar)
                    currentCount = 0
                    currentChar = it
                }
            }
        }
        return result.toCharArray()
    }
}

fun main() {
    val s = StringCompression()
    println(s.compress(charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')).toMutableList())
}