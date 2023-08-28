class Node {
    public Node left, right;
    public int size;
}

int CalculateSizes(Node root) {
    // Базовый случай рекурсии – это пустое дерево из нуля вершин.
    if (root == null) {
        return 0;
    }
    // Иначе суммируем размеры левого и правого поддерева
    // и прибавляем саму вершину root.
    root.size = 1 + CalculateSizes(root.left) + CalculateSizes(root.right);
    return root.size;
}
