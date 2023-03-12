fun printLMR(vertex: Vertex) {
    if (vertex.left != null) {
        printLMR(vertex.left)
    }
    println(vertex.value)
    if (vertex.right != null) {
        printLMR(vertex.right)
    }
}
