import java.util.*

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        s.mapIndexed { _, c ->
            if (c.toString() == "(" || c.toString() == "{" || c.toString() == "[") {
                stack.push(c)
            } else {
                if (stack.isEmpty()) return false
                if ((stack.peek().toString() == "(" && c.toString() == ")") || (stack.peek()
                        .toString() == "{" && c.toString() == "}") || (stack.peek()
                        .toString() == "[" && c.toString() == "]")
                ) {
                    stack.pop()
                } else {
                    return false
                }
            }
        }
        if (stack.isEmpty()) return true
        return false
    }
}

fun main() {
    val s = ValidParentheses()
    println(s.isValid("["))
}