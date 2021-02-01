class CheckPermutation {
    private fun sort(s: String): String {
        return s.toCharArray().sort().toString()
    }

    fun permutation(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        return sort(s) == sort(t)
    }
}