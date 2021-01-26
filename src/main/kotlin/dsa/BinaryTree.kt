package dsa

class BinaryNode(
    var key: Int,
    var left: BinaryNode? = null,
    var right: BinaryNode? = null
) {
    fun find(value: Int): BinaryNode? = when {
        key > value -> left?.find(value)
        key < value -> right?.find(value)
        else -> this
    }

    fun insert(value: Int) {
        if (value < key) {
            if (left == null) {
                left = BinaryNode(value)
            } else {
                left!!.insert(value)
            }
        } else if (value > key) {
            if (right == null) {
                right = BinaryNode(value)
            } else {
                left!!.insert(value)
            }
        }
    }
}
