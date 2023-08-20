class Node<T> {
    let obj: T
    var children: [Node<T>]

    init(obj: T, children: [Node<T>] = []) {
        self.obj = obj
        self.children = children
    }
}