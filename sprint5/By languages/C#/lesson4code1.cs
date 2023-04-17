void PrintForward(Node vertex) {
  Console.WriteLine(vertex.Value);
  foreach (Node child in vertex.Children) {
    PrintForward(child);
  }
}
