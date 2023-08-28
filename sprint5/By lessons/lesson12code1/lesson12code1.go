package main

type Node struct {
    left, right *Node
    size        int
}

func calculateSizes(root *Node) int {
    // Базовый случай рекурсии – это пустое дерево из нуля вершин.
    if root == nil {
        return 0
    }
    // Иначе суммируем размеры левого и правого поддерева
    // и прибавляем саму вершину root.
    root.size = 1 + calculateSizes(root.left) + calculateSizes(root.right)
    return root.size
}
