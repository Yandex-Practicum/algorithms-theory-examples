void print_forward(Node* vertex) {
  std::cout << vertex->value << std::endl;
  for (Node* child : vertex->children) {
    print_forward(child);
  }
}
