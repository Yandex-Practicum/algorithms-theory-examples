List<int> color; // Список цветов вершин.

void DFS(int v, List<List<int>> adjList) { // v - номер вершины
    color[v] = 1; // Вершина посещена, но ещё не обработана.
    foreach (int w in adjList[v]) { // Перебираем смежные вершины.
        if (color[w] == 0) { // Если вершина не посещена, то
            DFS(w, adjList); // запустим обход от найденной смежной вершины.
        }
    }
    color[v] = 2; // Теперь вершина обработана.
}

void mainDFS(int V, List<List<int>> adjList) {
    color = Enumerable.Repeat(0, V).ToList(); // Инициализируем список цветов.
    for (int i = 0; i < V; ++i) { // Перебираем варианты стартовых вершин.
        if (color[i] == 0) {
            DFS(i, adjList); // Запускаем обход, стартуя с i-й вершины.
        }
    }
}
