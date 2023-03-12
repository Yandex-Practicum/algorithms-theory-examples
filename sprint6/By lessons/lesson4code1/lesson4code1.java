void printReversed(Node node) {
    for (Node child : node.getChildren()) {
        printReversed(child);
    }
    System.out.println(node.getValue());
}
