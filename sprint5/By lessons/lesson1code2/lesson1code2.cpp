class Node {
public:
    Node(int obj, Node* left = nullptr, Node* right = nullptr)
        : obj(obj), left(left), right(right) {}
    int obj;
    Node* left;
    Node* right;
};
