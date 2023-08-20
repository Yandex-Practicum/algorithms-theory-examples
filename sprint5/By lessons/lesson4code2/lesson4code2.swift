func printReversed<T>(_ vertex: Node<T>) {
    for child in vertex.children {
        printReversed(child)
    }
    print(vertex.value)
}