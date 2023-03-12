void PrintReversed(Node node) {
    foreach (Node child in node.Children) {
        PrintReversed(child);
    }
    Console.WriteLine(node.Value);
}
