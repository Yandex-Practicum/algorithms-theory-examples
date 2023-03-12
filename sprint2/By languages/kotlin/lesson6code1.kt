fun getNodeByIndex(node: Node?, index: Int): Node? {
    var current = node
    while (index > 0 && current != null) {
        current = current.next
        index--
    }
    return current
}

fun insertNode(head: Node?, index: Int, value: Any): Node? {
    val newNode = Node(value)
    if (index == 0) {
        newNode.next = head
        return newNode
    }
    val previousNode = getNodeByIndex(head, index - 1)
    if (previousNode != null) {
        newNode.next = previousNode.next
        previousNode.next = newNode
    }
    return head
}

val node = Node("first")
node.next = Node("second")
node.next?.next = Node("third")

val index = 2
val value = "new_node"
var head = insertNode(node, index, value)

printLinkedList(head)


>>> first -> second -> new_node -> third -> None