func relax(u, v int) {
    // Проверяем, не получился ли путь короче найденного ранее.
    if dist[v] > dist[u]+weight(u, v) {
        dist[v] = dist[u] + weight(u, v)
        previous[v] = u
    }
}

func get_min_dist_not_visited_vertex() int {
    // Находим ещё непосещённую вершину с минимальным расстоянием от s.
    currentMinimum := math.MaxInt32
    currentMinimumVertex := -1

    for v := range graph.vertices {
        if !visited[v] && dist[v] < currentMinimum {
            currentMinimum = dist[v]
            currentMinimumVertex = v
        }
    }
    return currentMinimumVertex
}

func dijkstra(graph Graph, s int) {
    for v := range graph.vertices {
        dist[v] = math.MaxInt32   // Задаём расстояние по умолчанию.
        previous[v] = -1         // Задаём предшественника для восстановления SPT.
        visited[v] = false       // Список статусов посещённости вершин.
    }

    dist[s] = 0   // Расстояние от вершины до самой себя 0.

    for {
        u := get_min_dist_not_visited_vertex()

        if u == -1 || dist[u] == math.MaxInt32 {
            break
        }

        visited[u] = true
        // из множества рёбер графа выбираем те, которые исходят из вершины u
        neighbours := graph.outgoingEdges(u)

        for _, v := range neighbours {
            relax(u, v)
        }
    }
}
