package dsa

class Node<T>(var value: T) {
    var next: Node<T>? = null
}

class LinkedList<T> {
    var head: Node<T>? = null

    fun isEmpty() = head == null

    fun first(): Node<T>? = head

    fun last(): Node<T>? {
        if (head == null) return null
        var current: Node<T>? = head
        while (current?.next != null) {
            current = current.next
        }
        return current
    }

    fun append(value: T) {
        val newNode = Node(value)
        val lastNode = last()
        if (lastNode != null) {
            lastNode.next = newNode
        } else {
            head = newNode
        }
    }

    fun prepend(value: T) {
        val newHead = Node(value)
        newHead.next = head
        head = newHead
    }

    override fun toString(): String {
        var s = "["
        var node = head
        while (node != null) {
            s += "${node.value}"
            node = node.next
            if (node != null) { s += ", " }
        }
        return "$s]"
    }

}

fun main() {
    val linkedList = LinkedList<Int>()
    linkedList.append(1)
    linkedList.append(2)
}