pair<TreeNode*, TreeNode*> split(TreeNode* root, int k) {
    if (root == nullptr) {
        // Подумайте, что надо вернуть в таком случае.
        return make_pair(nullptr, nullptr);
    }
    if (get_size(root->left) + 1 <= k) {
        k -= 1 + get_size(root->left);
        auto [right, rightSide] = split(root->right, k);
        root->right = right;
        return make_pair(root, rightSide);
    }
    // Что должно происходить при спуске рекурсии в левое поддерево?
    auto [left, leftSide] = split(root->left, k);
    root->left = left;
    return make_pair(leftSide, root);
}
