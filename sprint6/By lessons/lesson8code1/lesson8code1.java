// Длины массивов равны числу вершин|V|.
String[] color = new String[V];
Integer[] previous = new Integer[V];
Integer[] distance = new Integer[V];

void BFS(int s) {
    // Создадим очередь вершин и положим туда стартовую вершину.
    Queue<Integer> planned = new LinkedList<>();
    planned.add(s);
    color[s] = "gray";
    distance[s] = 0;
    while (!planned.isEmpty()) {
        int u = planned.poll(); // Возьмём вершину из очереди.
        for (int v : adjList[u]) { // adjList - список смежности графа.
            if (color[v] == null) { // Серые и чёрные вершины уже
                // либо в очереди, либо обработаны.
                distance[v] = distance[u] + 1;
                previous[v] = u;
                color[v] = "gray";
                planned.add(v); // Запланируем посещение вершины.
            }
        }
        color[u] = "black"; // Теперь вершина считается обработанной.
    }
}

Stack<Integer> ShortestPath(int v) {
    // Класть вершины будем в стек, тогда
    // стартовая вершина окажется наверху стека
    // и порядок следования от s до v будет соответствовать
    // порядку извлечения вершин из стека.
    Stack<Integer> path = new Stack<Integer>();
    Integer current_vertex = v;
    while (current_vertex != null) { // Предшественник вершины s равен null.
        path.push(current_vertex);
        current_vertex = previous[current_vertex];
    }
    return path;
}
