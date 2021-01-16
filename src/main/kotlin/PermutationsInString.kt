fun main() {
//    println(s.permutationsString("abc", 0, 2))
    val permutation = PermutationInString()
    val str = "abc"
    println(permutation.permute(str, 0, str.length - 1))


}