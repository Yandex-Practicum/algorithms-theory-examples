func insertNode<T: Comparable>(_ root: Node<T>?, key: T) -> Node<T> {
    guard let root = root else {
        return Node(key: key)
    }
    
    if key < root.key {
        if root.left == nil {
            root.left = Node(key: key)
        } else {
            root.left = insertNode(root.left, key: key)
        }
    } else if key >= root.key {
        if root.right == nil {
            root.right = Node(key: key)
        } else {
            root.right = insertNode(root.right, key: key)
        }
    }
    
    return root
}