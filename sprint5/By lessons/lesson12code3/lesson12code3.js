function split(root, k) {
    if (root === null) {
        // Подумайте, что надо вернуть в таком случае.
        return [null, null];
    }
    if (get_size(root.left) + 1 <= k) {
        k -= 1 + get_size(root.left);
        const [right, rightSide] = split(root.right, k);
        root.right = right;
        return [root, rightSide];
    }
    // Что должно происходить при спуске рекурсии в левое поддерево?
    const [left, leftSide] = split(root.left, k);
    root.left = left;
    return [leftSide, root];
}
