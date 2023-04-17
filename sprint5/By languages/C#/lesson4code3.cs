void print_LMR(Node vertex) {
  if (vertex.left != null) {
    print_LMR(vertex.left);
  }
  Console.WriteLine(vertex.value);
  if (vertex.right != null) {
    print_LMR(vertex.right);
  }
}
