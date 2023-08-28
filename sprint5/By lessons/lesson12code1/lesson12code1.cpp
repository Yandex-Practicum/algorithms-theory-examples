struct Node {
    Node* left;
    Node* right;
    int size;
};

int calculateSizes(Node* root) {
    // Базовый случай рекурсии – это пустое дерево из нуля вершин.
    if (root == nullptr) {
        return 0;
    }
    // Иначе суммируем размеры левого и правого поддерева
    // и прибавляем саму вершину root.
    root->size = 1 + calculateSizes(root->left) + calculateSizes(root->right);
    return root->size;
}
