function relax(u, v) {
    // Проверяем, не получился ли путь короче найденного ранее.
    if (dist[v] > dist[u] + weight(u, v)) {
        dist[v] = dist[u] + weight(u, v);
        previous[v] = u;
    }
}

function get_min_dist_not_visited_vertex() {
    // Находим ещё непосещённую вершину с минимальным расстоянием от s.
    let currentMinimum = Number.MAX_VALUE;
    let currentMinimumVertex = null;

    for (let v of graph.vertices) {
        if (!visited[v] && dist[v] < currentMinimum) {
            currentMinimum = dist[v];
            currentMinimumVertex = v;
        }
    }
    return currentMinimumVertex;
}

function dijkstra(graph, s) {
    for (let v of graph.vertices) {
        dist[v] = Number.MAX_VALUE; // Задаём расстояние по умолчанию.
        previous[v] = null; // Задаём предшественника для восстановления SPT.
        visited[v] = false; // Список статусов посещённости вершин.
    }

    dist[s] = 0; // Расстояние от вершины до самой себя 0.

    while (true) {
        let u = get_min_dist_not_visited_vertex();

        if (u == null || dist[u] == Number.MAX_VALUE) {
            break;
        }

        visited[u] = true;
        // из множества рёбер графа выбираем те, которые исходят из вершины u
        let neighbours = graph.outgoingEdges(u);

        for (let [_, v] of neighbours) {
            relax(u, v);
        }
    }
}
