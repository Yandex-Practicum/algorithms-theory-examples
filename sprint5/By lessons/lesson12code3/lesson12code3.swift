func split(root: TreeNode?, k: Int) -> (TreeNode?, TreeNode?) {
    if root == nil {
        // Подумайте, что надо вернуть в таком случае.
        return (nil, nil)
    }
    if get_size(root: root!.left) + 1 <= k {
        var k = k - 1 - get_size(root: root!.left)
        let (right, rightSide) = split(root: root!.right, k: k)
        root!.right = right
        return (root, rightSide)
    }
    // Что должно происходить при спуске рекурсии в левое поддерево?
    let (left, leftSide) = split(root: root!.left, k: k)
    root!.left = left
    return (leftSide, root)
}
