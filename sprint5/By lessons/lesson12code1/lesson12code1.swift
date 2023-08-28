func calculateSizes(root: Node?) -> Int {
    // Базовый случай рекурсии – это пустое дерево из нуля вершин.
    guard let root = root else {
        return 0
    }
    // Иначе суммируем размеры левого и правого поддерева
    // и прибавляем саму вершину root.
    root.size = 1 + calculateSizes(root: root.left) + calculateSizes(root: root.right)
    return root.size
}
