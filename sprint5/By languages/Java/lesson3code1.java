public Node findNode(Node root, int value) {
  if (root == null) {
    return null;
  }
  if (value < root.getValue()) {
    return findNode(root.getLeft(), value);
  }
  if (value == root.getValue()) {
    return root;
  }
  if (value > root.getValue()) {
    return findNode(root.getRight(), value);
  }
}
