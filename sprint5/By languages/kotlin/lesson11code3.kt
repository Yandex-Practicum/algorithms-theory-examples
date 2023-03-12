// Функция возвращает два дерева, левое из которых имеет размер k.
fun split(root: TreeNode?, k: Int): Pair<TreeNode?, TreeNode?> {
    if (root == null) {
        // Подумайте, что надо вернуть в таком случае.
        return Pair(null, null)
    }
    if (getSize(root.left) + 1 <= k) {
        k -= 1 + getSize(root.left)
        val (right, rightSide) = split(root.right, k)
        root.right = right
        return Pair(root, rightSide)
    }
    // Что должно происходить при спуске рекурсии в левое поддерево?
    val (left, leftSide) = split(root.left, k)
    root.left = left
    return Pair(leftSide, root)
}