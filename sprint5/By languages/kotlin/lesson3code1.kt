fun printForward(vertex: Vertex) {
    println(vertex.value)
    for (child in vertex.children) {
        printForward(child)
    }
}
