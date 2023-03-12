func findNode(root *Node, value int) *Node {
  if root == nil {
    return nil
  }
  if value < root.value {
    return findNode(root.left, value)
  }
  if value == root.value {
    return root
  }
  if value > root.value {
    return findNode(root.right, value)
  }
}
