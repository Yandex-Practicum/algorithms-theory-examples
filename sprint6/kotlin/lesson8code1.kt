// Длины массивов равны числу вершин|V|.
val color = arrayOfNulls<String>(V)
val previous = arrayOfNulls<Int>(V)
val distance = arrayOfNulls<Int>(V)

fun BFS(s: Int) {
    // Создадим очередь вершин и положим туда стартовую вершину.
    val planned = LinkedList<Int>()
    planned.add(s)
    color[s] = "gray"
    distance[s] = 0
    while (planned.isNotEmpty()) {
        val u = planned.poll() // Возьмём вершину из очереди.
        for (v in adjList[u]) { // adjList - список смежности графа.
            if (color[v] == null) { // Серые и чёрные вершины уже
                // либо в очереди, либо обработаны.
                distance[v] = distance[u]!! + 1
                previous[v] = u
                color[v] = "gray"
                planned.add(v) // Запланируем посещение вершины.
            }
        }
        color[u] = "black" // Теперь вершина считается обработанной.
    }
}

fun ShortestPath(v: Int): Stack<Int> {
    // Класть вершины будем в стек, тогда
    // стартовая вершина окажется наверху стека
    // и порядок следования от s до v будет соответствовать
    // порядку извлечения вершин из стека.
    val path = Stack<Int>()
    var current_vertex: Int? = v
    while (current_vertex != null) { // Предшественник вершины s равен null.
        path.push(current_vertex)
        current_vertex = previous[current_vertex]
    }
    return path
}
