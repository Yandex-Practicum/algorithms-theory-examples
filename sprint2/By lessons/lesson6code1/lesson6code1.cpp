#include <iostream>

struct Node {
    Node *next;
    int value;
    Node(int value) : next(nullptr), value(value) {}
};

void printLinkedList(Node *node) {
    while (node != nullptr) {
        std::cout << node->value << " -> ";
        node = node->next;
    }
    std::cout << "None" << std::endl;
}

Node *getNodeByIndex(Node *node, int index) {
    while (index > 0) {
        node = node->next;
        index--;
    }
    return node;
}

Node *insertNode(Node *head, int index, int value) {
    Node *newNode = new Node(value);
    if (index == 0) {
        newNode->next = head;
        return newNode;
    }
    Node *previousNode = getNodeByIndex(head, index-1);
    newNode->next = previousNode->next;
    previousNode->next = newNode;
    return head;
}

int main() {
    Node *n3 = new Node(3);
    Node *n2 = new Node(2);
    Node *n1 = new Node(1);
    n1->next = n2;
    n2->next = n3;
    Node *node = n1;
    int index = 2;
    int value = 4;
    Node *head = insertNode(node, index, value);
    printLinkedList(head);
    return 0;
}
