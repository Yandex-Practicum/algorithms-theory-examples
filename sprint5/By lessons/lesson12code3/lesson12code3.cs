class Solution {
    public static (TreeNode, TreeNode) Split(TreeNode root, int k) {
        if (root == null) {
            // Подумайте, что надо вернуть в таком случае.
            return (null, null);
        }
        if (Get_Size(root.left) + 1 <= k) {
            k -= 1 + Get_Size(root.left);
            var (right, rightSide) = Split(root.right, k);
            root.right = right;
            return (root, rightSide);
        }
        // Что должно происходить при спуске рекурсии в левое поддерево?
        var (left, leftSide) = Split(root.left, k);
        root.left = left;
        return (leftSide, root);
    }
}
