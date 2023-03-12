// Длины массивов равны числу вершин|V|.
var color = make([]string, V)
var previous = make([]int, V)
var distance = make([]int, V)

func BFS(s int) {
    // Создадим очередь вершин и положим туда стартовую вершину.
    planned := []int{s}
    color[s] = "gray"
    distance[s] = 0
    for len(planned) > 0 {
        u := planned[0] // Возьмём вершину из очереди.
        planned = planned[1:]
        for _, v := range adjList[u] { // adjList - список смежности графа.
            if color[v] == "" { // Серые и чёрные вершины уже
                // либо в очереди, либо обработаны.
                distance[v] = distance[u] + 1
                previous[v] = u
                color[v] = "gray"
                planned = append(planned, v) // Запланируем посещение вершины.
            }
        }
        color[u] = "black" // Теперь вершина считается обработанной.
    }
}

func ShortestPath(v int) []int {
    // Класть вершины будем в слайс, тогда
    // стартовая вершина окажется последней в слайсе
    // и порядок следования от s до v будет соответствовать
    // порядку извлечения вершин из слайса.
    path := []int{}
    current_vertex := v
    for current_vertex != -1 { // Предшественник вершины s равен -1.
        path = append(path, current_vertex)
        current_vertex = previous[current_vertex]
    }
    for i, j := 0, len(path)-1; i < j; i, j = i+1, j-1 {
        path[i], path[j] = path[j], path[i]
    }
    return path
}
