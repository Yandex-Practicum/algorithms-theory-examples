fun insertNode(root: Node, key: Int) {
    if (key < root.key) {
        if (root.left == null) {
            root.left = Node(key)
        } else {
            insertNode(root.left, key)
        }
    } else {
        if (root.right == null) {
            root.right = Node(key)
        } else {
            insertNode(root.right, key)
        }
    }
}
