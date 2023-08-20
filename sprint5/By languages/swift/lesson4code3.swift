func printLMR<T>(_ vertex: Node<T>?) {
    guard let vertex = vertex else {
        return
    }
    
    if let leftChild = vertex.left {
        printLMR(leftChild)
    }
    
    print(vertex.value)
    
    if let rightChild = vertex.right {
        printLMR(rightChild)
    }
}