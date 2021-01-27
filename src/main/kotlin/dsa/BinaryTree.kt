package dsa

class BinaryNode(
    var key: Int,
    var left: BinaryNode? = null,
    var right: BinaryNode? = null
) {
    fun insert(value: Int) {
        if (value <= key) {
            if (left == null) {
                left = BinaryNode(value)
            } else {
                left!!.insert(value)
            }
        } else {
            if (right == null) {
                right = BinaryNode(value)
            } else {
                right!!.insert(value)
            }
        }
    }

    fun contains(value: Int): Boolean {
        if (key == value) return true
        if (value < key) {
            if (left == null) {
                return false
            } else {
                return left!!.contains(value)
            }
        } else {
            if (right == null) {
                return false
            } else {
                return right!!.contains(value)
            }
        }
    }

    fun printInOrder() {
        if (left != null) {
            left!!.printInOrder()
        }
        println(key)
        if (right != null) {
            right!!.printInOrder()
        }
    }
}

fun main() {
    val tree = BinaryNode(3)
    tree.insert(2)
    tree.insert(1)
    tree.insert(4)
    tree.insert(6)
    tree.printInOrder()
}
