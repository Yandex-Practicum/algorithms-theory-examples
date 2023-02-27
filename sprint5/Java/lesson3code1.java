void printForward(Node vertex) {
  System.out.println(vertex.value);
  for (Node child : vertex.children) {
    printForward(child);
  }
}
