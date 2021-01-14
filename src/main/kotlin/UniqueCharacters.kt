class UniqueCharacters {
    fun uniqueCharacters(s: String) : Boolean {
        var charArray = s.toCharArray().sort()
        println(s)
        return true
    }
}


fun main() {
    val uniqueCharacters = UniqueCharacters()
    val a = mutableListOf("a", "b", "c").binarySearch("c")
    println(a)
}