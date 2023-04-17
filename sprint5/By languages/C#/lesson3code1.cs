Node FindNode(Node root, int value) {
  if (root == null) {
    return null;
  }
  if (value < root.Value) {
    return FindNode(root.Left, value);
  }
  if (value == root.Value) {
    return root;
  }
  if (value > root.Value) {
    return FindNode(root.Right, value);
  }
}
