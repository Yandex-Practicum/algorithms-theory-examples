
fun printReversed(vertex: Vertex) {
    for (child in vertex.children) {
        printReversed(child)
    }
    println(vertex.value)
}

