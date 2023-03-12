class Node(var value: Any? = null, var next: Node? = null)

fun printLinkedList(vertex: Node?) {
    var current = vertex
    while (current != null) {
        print("${current.value} -> ")
        current = current.next
    }
    println("None")
}


val n3 = Node(value = 'third')
val n2 = Node(value = 'second', next = n3)
val n1 = Node(value = 'first', next = n2)
printLinkedList(n1)
>>> first -> second -> third -> None

printLinkedList(n2)
>>> second -> third -> None