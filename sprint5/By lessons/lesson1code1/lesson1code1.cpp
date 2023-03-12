#include <vector>

class Node {
public:
    Node(int obj, std::vector<Node*> children = {}): obj(obj), children(children) {}
    int obj;
    std::vector<Node*> children;
};
