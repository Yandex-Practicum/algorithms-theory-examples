class Node {
public:
    int key;
    int height;
    Node* left;
    Node* right;

    Node(int k, int h=1, Node* l=nullptr, Node* r=nullptr) : key(k), height(h), left(l), right(r) {}
};
