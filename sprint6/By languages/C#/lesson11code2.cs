// Считываются размеры поля и сама карта.
int n = ...; // Число строк и столбцов в карте.
int m = ...;
int[][] field = ...; // Считываем саму карту.
Tuple<int, int> start_point = ...; // Найдём стартовую клетку, в которой стоит звёздочка.

public Tuple<int, Tuple<int, int>> EscapeFromMaze(int n, int m, int[][] field, Tuple<int, int> start_point)
{
    // Предок вершины (x, y) -- это предыдущая вершина на кратчайшем пути 
    // от стартовой точки до текущей (x, y). 
    // Изначально заполняем любыми невалидными значениями, например, null или -1.
    int[][] prev = new int[n][];
    for (int i = 0; i < n; i++)
    {
        prev[i] = new int[m];
        for (int j = 0; j < m; j++)
        {
            prev[i][j] = -1;
        }
    }

    // Заполняем массив расстояний нейтральными по отношению к минимуму значениями.
    // Значение x нейтральное, если min(x, y) = y для любого допустимого y.
    int INF = n * m + 10;
    int[][] dist = new int[n][];
    for (int i = 0; i < n; i++)
    {
        dist[i] = new int[m];
        for (int j = 0; j < m; j++)
        {
            dist[i][j] = INF;
        }
    }

    // Начинаем обход в ширину (BFS).
    // Заведём очередь, поддерживающую операции Enqueue и Dequeue.
    Queue<Tuple<int, int>> q = new Queue<Tuple<int, int>>();

    q.Enqueue(start_point);
    while (q.Count > 0)
    {
        Tuple<int, int> current_point = q.Dequeue();
        foreach (Tuple<int, int> move in movements)
        {
            Tuple<int, int> new_point = Add(current_point, move);
            if (IsFree(new_point) && dist[new_point.Item1][new_point.Item2] == INF)
            {
                q.Enqueue(new_point);
                prev[new_point.Item1][new_point.Item2] = current_point;
                dist[new_point.Item1][new_point.Item2] = dist[current_point.Item1][current_point.Item2] + 1;
                if (IsExit(new_point))
                {
                    return new Tuple<int, Tuple<int, int>>(dist[new_point.Item1][new_point.Item2], new_point);
                }
            }
        }
    }

    return new Tuple<int, Tuple<int, int>>(INF, new Tuple<int, int>(-1, -1));
}
