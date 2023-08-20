class Node<T> {
    let obj: T
    var left: Node<T>?
    var right: Node<T>?

    init(obj: T, left: Node<T>? = nil, right: Node<T>? = nil) {
        self.obj = obj
        self.left = left
        self.right = right
    }
}
