class Node<T: Comparable> {
    var key: T
    var left: Node<T>?
    var right: Node<T>?
    var height: Int
    
    init(key: T, height: Int = 1, left: Node<T>? = nil, right: Node<T>? = nil) {
        self.key = key
        self.left = left
        self.right = right
        self.height = height
    }
}