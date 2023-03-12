void Relax(int u, int v)
{
    // Проверяем, не получился ли путь короче найденного ранее.
    if (dist[v] > dist[u] + Weight(u, v))
    {
        dist[v] = dist[u] + Weight(u, v);
        previous[v] = u;
    }
}

int? GetMinDistNotVisitedVertex()
{
    // Находим ещё непосещённую вершину с минимальным расстоянием от s.
    int currentMinimum = int.MaxValue;
    int? currentMinimumVertex = null;

    foreach (var v in graph.Vertices)
    {
        if (!visited[v] && dist[v] < currentMinimum)
        {
            currentMinimum = dist[v];
            currentMinimumVertex = v;
        }
    }
    return currentMinimumVertex;
}

void Dijkstra(Graph graph, int s)
{
    foreach (var v in graph.Vertices)
    {
        dist[v] = int.MaxValue;         // Задаём расстояние по умолчанию.
        previous[v] = null;          // Задаём предшественника для восстановления SPT.
        visited[v] = false;        // Список статусов посещённости вершин.
    }

    dist[s] = 0;     // Расстояние от вершины до самой себя 0.

    while (true)
    {
        int? u = GetMinDistNotVisitedVertex();

        if (u == null || dist[u.Value] == int.MaxValue)
        {
            break;
        }

        visited[u.Value] = true;
        // из множества рёбер графа выбираем те, которые исходят из вершины u
        var neighbours = graph.OutgoingEdges(u.Value);

        foreach (var neighbour in neighbours)
        {
            Relax(u.Value, neighbour.To);
        }
    }
}
