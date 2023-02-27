class Stack {
    private var items = mutableListOf<Any>()
    fun push(item: Any) {
        items.add(item)
    }
    fun pop(): Any? {
        return if (items.isNotEmpty()) items.removeAt(items.size - 1) else null
    }
    fun peek(): Any? {
        return if (items.isNotEmpty()) items.last() else null
    }
    fun size(): Int {
        return items.size
    }
}

fun main(args: Array<String>) {
    val stack = Stack()
    stack.push("apple")
    stack.push("banana")
    stack.push("orange")
    stack.pop()
}