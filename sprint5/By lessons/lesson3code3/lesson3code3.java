void print_LMR(Node vertex) {
  if (vertex.left != null) {
    print_LMR(vertex.left);
  }
  System.out.println(vertex.value);
  if (vertex.right != null) {
    print_LMR(vertex.right);
  }
}
