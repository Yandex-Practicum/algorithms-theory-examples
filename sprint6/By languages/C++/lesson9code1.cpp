void relax(int u, int v) {
    // Проверяем, не получился ли путь короче найденного ранее.
    if (dist[v] > dist[u] + weight(u, v)) {
        dist[v] = dist[u] + weight(u, v);
        previous[v] = u;
    }
}

int get_min_dist_not_visited_vertex() {
    // Находим ещё непосещённую вершину с минимальным расстоянием от s.
    int currentMinimum = INT_MAX;
    int currentMinimumVertex = -1;

    for (int v : graph.vertices) {
        if (!visited[v] && dist[v] < currentMinimum) {
            currentMinimum = dist[v];
            currentMinimumVertex = v;
        }
    }
    return currentMinimumVertex;
}

void dijkstra(Graph graph, int s) {
    for (int v : graph.vertices) {
        dist[v] = INT_MAX;         // Задаём расстояние по умолчанию.
        previous[v] = -1;          // Задаём предшественника для восстановления SPT.
        visited[v] = false;        // Список статусов посещённости вершин.
    }

    dist[s] = 0;     // Расстояние от вершины до самой себя 0.

    while (true) {
        int u = get_min_dist_not_visited_vertex();

        if (u == -1 || dist[u] == INT_MAX) {
            break;
        }

        visited[u] = true;
        // из множества рёбер графа выбираем те, которые исходят из вершины u
        vector<pair<int, int>> neighbours = graph.outgoingEdges(u);

        for (auto [_, v] : neighbours) {
            relax(u, v);
        }
    }
}
