public class Solution {
    public static Pair<TreeNode, TreeNode> split(TreeNode root, int k) {
        if (root == null) {
            // Подумайте, что надо вернуть в таком случае.
            return new Pair<>(null, null);
        }
        if (getSize(root.left) + 1 <= k) {
            k -= 1 + getSize(root.left);
            Pair<TreeNode, TreeNode> rightPair = split(root.right, k);
            root.right = rightPair.getKey();
            return new Pair<>(root, rightPair.getValue());
        }
        // Что должно происходить при спуске рекурсии в левое поддерево?
        Pair<TreeNode, TreeNode> leftPair = split(root.left, k);
        root.left = leftPair.getKey();
        return new Pair<>(leftPair.getValue(), root);
    }
}
