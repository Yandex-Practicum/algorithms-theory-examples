fun relax(u: Int, v: Int) {
    // Проверяем, не получился ли путь короче найденного ранее.
    if (dist[v] > dist[u] + weight(u, v)) {
        dist[v] = dist[u] + weight(u, v)
        previous[v] = u
    }
}

fun get_min_dist_not_visited_vertex(): Int? {
    // Находим ещё непосещённую вершину с минимальным расстоянием от s.
    var currentMinimum = Int.MAX_VALUE
    var currentMinimumVertex: Int? = null

    for (v in graph.vertices) {
        if (!visited[v] && dist[v] < currentMinimum) {
            currentMinimum = dist[v]
            currentMinimumVertex = v
        }
    }
    return currentMinimumVertex
}

fun dijkstra(graph: Graph, s: Int) {
    for (v in graph.vertices) {
        dist[v] = Int.MAX_VALUE         // Задаём расстояние по умолчанию.
        previous[v] = null          // Задаём предшественника для восстановления SPT.
        visited[v] = false        // Список статусов посещённости вершин.
    }

    dist[s] = 0     // Расстояние от вершины до самой себя 0.

    while (true) {
        val u = get_min_dist_not_visited_vertex()

        if (u == null || dist[u] == Int.MAX_VALUE) {
            break
        }

        visited[u] = true
        // из множества рёбер графа выбираем те, которые исходят из вершины u
        val neighbours = graph.outgoingEdges(u)

        for ((_, v) in neighbours) {
            relax(u, v)
        }
    }
}
