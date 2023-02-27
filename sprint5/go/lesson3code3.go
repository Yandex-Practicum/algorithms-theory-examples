func print_LMR(vertex *Node) {
  if vertex.left != nil {
    print_LMR(vertex.left)
  }
  fmt.Println(vertex.value)
  if vertex.right != nil {
    print_LMR(vertex.right)
  }
}
