func smallLeftRotation() -> Node<T> {
    // Задаём обозначения.
    guard let b = right else {
        fatalError("Unable to perform small left rotation: right child is nil.")
    }
    let C = b.left
    
    // Переусыновляем вершины.
    right = C
    b.left = self
    
    // Корректируем высоты в зависимости от того, равны ли высоты C и R.
    if let CHeight = C?.height, CHeight == height {
        height -= 1
        b.height += 1
    } else {
        height -= 2
    }
    
    // Возвращаем новый корень.
    return b
}