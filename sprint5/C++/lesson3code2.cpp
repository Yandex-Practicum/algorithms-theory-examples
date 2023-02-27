void print_reversed(Node* vertex) {
  for (auto child : vertex->children) {
    print_reversed(child);
  }
  std::cout << vertex->value << std::endl;
}
