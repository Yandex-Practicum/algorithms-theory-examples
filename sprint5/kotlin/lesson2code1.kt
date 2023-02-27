fun findNode(root: Node?, value: Int): Node? {
    // Если мы пришли в поддерево, а его не существует, значит, нужного элемента в дереве поиска нет
    if (root == null) {
        return null // "Значение {value} не найдено"
    }
    return when {
        value < root.value -> findNode(root.left, value)
        value == root.value -> root
        value > root.value -> findNode(root.right, value)
        else -> null
    }
}