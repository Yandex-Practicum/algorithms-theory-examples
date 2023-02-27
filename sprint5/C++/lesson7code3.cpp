Node* big_left_rotation(Node* a) {
  Node* b = a->right;
  Node* c = b->left;
  Node* M = c->left;
  Node* N = c->right;

  a->right = M;
  b->left = N;
  c->left = a;
  c->right = b;

  a->height -= 2;
  b->height -= 1;
  c->height += 1;
  return c;
}
