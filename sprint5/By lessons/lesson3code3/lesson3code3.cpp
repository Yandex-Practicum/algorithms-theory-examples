void print_LMR(Node* vertex) {
  if (vertex->left != nullptr) {
    print_LMR(vertex->left);
  }
  std::cout << vertex->value << std::endl;
  if (vertex->right != nullptr) {
    print_LMR(vertex->right);
  }
}
