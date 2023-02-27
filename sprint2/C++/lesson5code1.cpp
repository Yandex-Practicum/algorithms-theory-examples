#include <iostream>

struct Node {
    int value;
    Node* next = nullptr;
}

void print_linked_list(Node* vertex) {
    while (vertex) {
        std::cout << vertex->value << " -> ";
        vertex = vertex->next;
    }
    std::cout << "None" << std::endl;
}

int main() {
    Node* n3 = new Node("third");
    Node* n2 = new Node("second", n3);
    Node* n1 = new Node("first", n2);
    print_linked_list(n1);
    print_linked_list(n2);

    delete n3;
    delete n2;
    delete n1;
    return 0;
}