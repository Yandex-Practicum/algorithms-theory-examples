Node* find_node(Node* root, int value) {
  if (root == nullptr) {
    return nullptr;
  }
  if (value < root->value) {
    return find_node(root->left, value);
  }
  if (value == root->value) {
    return root;
  }
  if (value > root->value) {
    return find_node(root->right, value);
  }
}
