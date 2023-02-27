public void DFS(int startVertex) {
    Stack<Integer> stack = new Stack<>();
    stack.push(startVertex);
    while (!stack.empty()) {
        int v = stack.pop(); // Получаем из стека очередную вершину.
        if (color[v] == white) {
            // Красим вершину в серый. И сразу кладём её обратно в стек:
            // это позволит алгоритму позднее вспомнить обратный путь по графу.
            color[v] = gray;
            stack.push(v);
            // Теперь добавляем в стек все непосещённые соседние вершины,
            // вместо вызова рекурсии
            for (int w : adjList[v]) { // Перебираем смежные вершины.
                if (color[w] == white) { // Если вершина не посещена, то
                    stack.push(w);
                }
            }
        } else if (color[v] == gray) {
            // Серую вершину мы могли получить из стека только на обратном пути.
            // Следовательно, её следует перекрасить в чёрный.
            color[v] = black;
        }
    }
}
