func bigLeftRotation() -> Node<T> {
    // Задаём обозначения.
    guard let b = right, let c = b.left, let M = c.left, let N = c.right else {
        fatalError("Unable to perform big left rotation: some child nodes are nil.")
    }
    
    // Переусыновляем вершины.
    right = M
    b.left = N
    c.left = self
    c.right = b
    
    // Корректируем высоты.
    height -= 2
    b.height -= 1
    c.height += 1
    
    // Возвращаем новый корень.
    return c
}

