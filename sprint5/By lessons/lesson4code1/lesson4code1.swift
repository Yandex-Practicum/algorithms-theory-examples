func printForward<T>(_ vertex: Node<T>) {
    print(vertex.value)
    for child in vertex.children {
        printForward(child)
    }
}