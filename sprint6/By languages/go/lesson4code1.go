func printReversed(node *Node) {
    for _, child := range node.children {
        printReversed(child)
    }
    fmt.Println(node.value)
}
