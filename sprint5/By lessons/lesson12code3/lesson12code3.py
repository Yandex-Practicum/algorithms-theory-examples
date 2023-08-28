def split(root, k):
    if root is None:
        # Подумайте, что надо вернуть в таком случае.
        return (None, None)
    if get_size(root.left) + 1 <= k:
        k -= 1 + get_size(root.left)
        right, right_side = split(root.right, k)
        root.right = right
        return (root, right_side)
    # Что должно происходить при спуске рекурсии в левое поддерево?
    left, left_side = split(root.left, k)
    root.left = left
    return (left_side, root)
