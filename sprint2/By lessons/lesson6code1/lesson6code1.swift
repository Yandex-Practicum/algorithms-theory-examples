func getNodeByIndex<T>(_ node: Node<T>?, index: Int) -> Node<T>? {
    var currentNode = node
    var currentIndex = index
    while currentIndex > 0 {
        currentNode = currentNode?.next
        currentIndex -= 1
    }
    return currentNode
}

func insertNode<T>(_ head: Node<T>?, index: Int, value: T) -> Node<T>? {
    let newNode = Node(value: value)
    if index == 0 {
        newNode.next = head
        return newNode
    }
    let previousNode = getNodeByIndex(head, index: index - 1)
    newNode.next = previousNode?.next
    previousNode?.next = newNode
    return head
}

let index = 2
let value = "new_node"
let head = insertNode(n1, index: index, value: value)
printLinkedList(head)
//first -> second -> new_node -> third -> None