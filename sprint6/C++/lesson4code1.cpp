void printReversed(Node* node) {
    for (Node* child : node->children) {
        printReversed(child);
    }
    std::cout << node->value << std::endl;
}
