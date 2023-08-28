package main

func split(root *TreeNode, k int) (*TreeNode, *TreeNode) {
    if root == nil {
        // Подумайте, что надо вернуть в таком случае.
        return nil, nil
    }
    if get_size(root.left) + 1 <= k {
        k -= 1 + get_size(root.left)
        right, rightSide := split(root.right, k)
        root.right = right
        return root, rightSide
    }
    // Что должно происходить при спуске рекурсии в левое поддерево?
    left, leftSide := split(root.left, k)
    root.left = left
    return leftSide, root
}

