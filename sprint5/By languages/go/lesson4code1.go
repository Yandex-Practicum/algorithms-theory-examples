func insert_node(root *Node, key int) {
  if key < root.key {
    if root.left == nil {
      root.left = &Node{key: key}
    } else {
      insert_node(root.left, key)
    }
  } else {
    if root.right == nil {
      root.right = &Node{key: key}
    } else {
      insert_node(root.right, key)
    }
  }
}
