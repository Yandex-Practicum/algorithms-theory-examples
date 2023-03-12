function printReversed(vertex) {
  vertex.children.forEach(child => printReversed(child));
  console.log(vertex.value);
}
