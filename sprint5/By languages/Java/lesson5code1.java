void insert_node(Node root, int key) {
  if (key < root.key) {
    if (root.left == null) {
      root.left = new Node(key);
    } else {
      insert_node(root.left, key);
    }
  } else {
    if (root.right == null) {
      root.right = new Node(key);
    } else {
      insert_node(root.right, key);
    }
  }
}
