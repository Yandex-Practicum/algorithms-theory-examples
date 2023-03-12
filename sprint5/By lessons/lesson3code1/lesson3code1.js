function printForward(vertex) {
  console.log(vertex.value);
  vertex.children.forEach(child => printForward(child));
}
