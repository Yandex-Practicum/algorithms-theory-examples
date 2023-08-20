class Node<T> {
    var value: T?
    var next: Node<T>?
    
    init(value: T?, next: Node<T>? = nil) {
        self.value = value
        self.next = next
    }
}

func printLinkedList<T>(_ vertex: Node<T>?) {
    var currentVertex = vertex
    while let value = currentVertex?.value {
        print(value, terminator: " -> ")
        currentVertex = currentVertex?.next
    }
    print("None")
}

let n3 = Node(value: "third")
let n2 = Node(value: "second", next: n3)
let n1 = Node(value: "first", next: n2)
printLinkedList(n1)
// first -> second -> third -> None
printLinkedList(n2)
// second -> third -> None