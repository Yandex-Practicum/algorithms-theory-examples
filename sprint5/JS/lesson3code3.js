function print_LMR(vertex) {
  if (vertex.left !== null) {
    print_LMR(vertex.left);
  }
  console.log(vertex.value);
  if (vertex.right !== null) {
    print_LMR(vertex.right);
  }
}
