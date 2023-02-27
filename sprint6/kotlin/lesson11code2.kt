// Считываются размеры поля и сама карта.
val n: Int = ...         // Число строк и столбцов в карте.
val m: Int = ...         
val field: Array<IntArray> = ...        // Считываем саму карту.
val start_point: Pair<Int, Int> = ...  // Найдём стартовую клетку, в которой стоит звёздочка.

fun escape_from_maze(n: Int, m: Int, field: Array<IntArray>, start_point: Pair<Int, Int>): Pair<Int, Pair<Int, Int>> {
    // Предок вершины (x, y) -- это предыдущая вершина на кратчайшем пути 
    // от стартовой точки до текущей (x, y). 
    // Изначально заполняем любыми невалидными значениями, например, null или -1.
    val prev = Array(n) { IntArray(m) { -1 } }

    // Заполняем массив расстояний нейтральными по отношению к минимуму значениями.
    // Значение x нейтральное, если min(x, y) = y для любого допустимого y.
    val INF = n * m + 10
    val dist = Array(n) { IntArray(m) { INF } }

    // Начинаем обход в ширину (BFS).
    // Заведём очередь, поддерживающую операции push и pop.
    val q = LinkedList<Pair<Int, Int>>()

    q.add(start_point)
    while (q.isNotEmpty()) {
        val current_point = q.pop()
        for (move in movements) {
            val new_point = add(current_point, move)
            if (is_free(new_point) && dist[new_point.first][new_point.second] == INF) {
                q.add(new_point)
                prev[new_point.first][new_point.second] = current_point
                dist[new_point.first][new_point.second] = dist[current_point.first][current_point.second] + 1
                if (is_exit(new_point)) {
                    return Pair(dist[new_point.first][new_point.second], new_point)
                }
            }
        }
    }

    return Pair(INF, Pair(-1, -1))
}
