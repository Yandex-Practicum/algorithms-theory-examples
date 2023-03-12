// Считываются размеры поля и сама карта.
int n = ...;         // Число строк и столбцов в карте.
int m = ...;         
int[][] field = ...;        // Считываем саму карту.
Pair<Integer, Integer> start_point = ...;  // Найдём стартовую клетку, в которой стоит звёздочка.

public static Pair<Integer, Pair<Integer, Integer>> escapeFromMaze(int n, int m, int[][] field, Pair<Integer, Integer> start_point) {
    // Предок вершины (x, y) -- это предыдущая вершина на кратчайшем пути 
    // от стартовой точки до текущей (x, y). 
    // Изначально заполняем любыми невалидными значениями, например, null или -1.
    Integer[][] prev = new Integer[n][m];
    for (int i = 0; i < n; i++) {
        Arrays.fill(prev[i], -1);
    }

    // Заполняем массив расстояний нейтральными по отношению к минимуму значениями.
    // Значение x нейтральное, если min(x, y) = y для любого допустимого y.
    int INF = n * m + 10;
    int[][] dist = new int[n][m];
    for (int i = 0; i < n; i++) {
        Arrays.fill(dist[i], INF);
    }

    // Начинаем обход в ширину (BFS).
    // Заведём очередь, поддерживающую операции offer и poll.
    Queue<Pair<Integer, Integer>> q = new LinkedList<>();

    q.offer(start_point);
    while (!q.isEmpty()) {
        Pair<Integer, Integer> current_point = q.poll();
        for (int[] move : movements) {
            Pair<Integer, Integer> new_point = add(current_point, move);
            if (isFree(new_point) && dist[new_point.first][new_point.second] == INF) {
                q.offer(new_point);
                prev[new_point.first][new_point.second] = current_point;
                dist[new_point.first][new_point.second] = dist[current_point.first][current_point.second] + 1;
                if (isExit(new_point)) {
                    return new Pair<>(dist[new_point.first][new_point.second], new_point);
                }
            }
        }
    }

    return new Pair<>(INF, new Pair<>(-1, -1));
}
