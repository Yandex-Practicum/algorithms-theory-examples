fun printReversed(node: Node) {
    for (child in node.children) {
        printReversed(child)
    }
    println(node.value)
}
