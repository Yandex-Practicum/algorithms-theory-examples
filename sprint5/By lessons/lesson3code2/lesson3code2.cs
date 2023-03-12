void PrintReversed(Node vertex) {
  foreach (var child in vertex.children) {
    PrintReversed(child);
  }
  Console.WriteLine(vertex.value);
}
