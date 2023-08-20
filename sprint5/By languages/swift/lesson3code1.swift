func findNode<T: Comparable>(_ root: Node<T>?, _ value: T) -> Node<T>? {
    // Если мы пришли в поддерево, а его не существует, значит, нужного элемента в дереве поиска нет
    guard let rootNode = root else {
        return nil
    }
    
    if value < rootNode.value {
        return findNode(rootNode.left, value)
    } else if value == rootNode.value {
        return rootNode
    } else {
        return findNode(rootNode.right, value)
    }
}
