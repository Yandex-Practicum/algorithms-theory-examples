func printForward(vertex *Node) {
  fmt.Println(vertex.value)
  for _, child := range vertex.children {
    printForward(child)
  }
}
