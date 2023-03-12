func printReversed(vertex *Node) {
  for _, child := range vertex.children {
    printReversed(child)
  }
  fmt.Println(vertex.value)
}
