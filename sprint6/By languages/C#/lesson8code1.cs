// Длины массивов равны числу вершин|V|.
string[] color = new string[V];
int?[] previous = new int?[V];
int?[] distance = new int?[V];

void BFS(int s) {
    // Создадим очередь вершин и положим туда стартовую вершину.
    Queue<int> planned = new Queue<int>();
    planned.Enqueue(s);
    color[s] = "gray";
    distance[s] = 0;
    while (planned.Count > 0) {
        int u = planned.Dequeue(); // Возьмём вершину из очереди.
        foreach (int v in adjList[u]) { // adjList - список смежности графа.
            if (color[v] == null) { // Серые и чёрные вершины уже
                // либо в очереди, либо обработаны.
                distance[v] = distance[u] + 1;
                previous[v] = u;
                color[v] = "gray";
                planned.Enqueue(v); // Запланируем посещение вершины.
            }
        }
        color[u] = "black"; // Теперь вершина считается обработанной.
    }
}

Stack<int> ShortestPath(int v) {
    // Класть вершины будем в стек, тогда
    // стартовая вершина окажется наверху стека
    // и порядок следования от s до v будет соответствовать
    // порядку извлечения вершин из стека.
    Stack<int> path = new Stack<int>();
    int? current_vertex = v;
    while (current_vertex != null) { // Предшественник вершины s равен null.
        path.Push(current_vertex.Value);
        current_vertex = previous[current_vertex.Value];
    }
    return path;
}
