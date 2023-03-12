function findNode(root, value) {
  if (root == null) {
    return null;
  }
  if (value < root.value) {
    return findNode(root.left, value);
  }
  if (value == root.value) {
    return root;
  }
  if (value > root.value) {
    return findNode(root.right, value);
  }
}
