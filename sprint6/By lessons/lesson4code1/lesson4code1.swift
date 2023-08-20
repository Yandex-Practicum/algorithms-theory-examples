func printReversed(node: Node) {
    for child in node.children {
        printReversed(node: child)
    }
    print(node.value)
}
