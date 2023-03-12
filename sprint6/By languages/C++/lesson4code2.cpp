vector<int> color; // Вектор цветов вершин.

void DFS(int v, vector<vector<int>>& adjList) { // v - номер вершины
    color[v] = 1; // Вершина посещена, но ещё не обработана.
    for (int w : adjList[v]) { // Перебираем смежные вершины.
        if (color[w] == 0) { // Если вершина не посещена, то
            DFS(w, adjList); // запустим обход от найденной смежной вершины.
        }
    }
    color[v] = 2; // Теперь вершина обработана.
}

void mainDFS(int V, vector<vector<int>>& adjList) {
    color.assign(V, 0); // Инициализируем вектор цветов.
    for (int i = 0; i < V; ++i) { // Перебираем варианты стартовых вершин.
        if (color[i] == 0) {
            DFS(i, adjList); // Запускаем обход, стартуя с i-й вершины.
        }
    }
}
