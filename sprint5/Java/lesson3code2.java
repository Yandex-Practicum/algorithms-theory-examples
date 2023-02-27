void printReversed(Node vertex) {
  for (Node child : vertex.children) {
    printReversed(child);
  }
  System.out.println(vertex.value);
}
