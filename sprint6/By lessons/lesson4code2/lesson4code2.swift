enum Color {
    case white
    case gray
    case black
}

var color: [Color] = [] // Массив цветов вершин.

func DFS(_ v: Int, _ adjList: [[Int]]) { // v - номер вершины
    color[v] = .gray // Вершина посещена, но ещё не обработана.
    for w in adjList[v] { // Перебираем смежные вершины.
        if color[w] == .white { // Если вершина не посещена, то
            DFS(w, adjList) // запустим обход от найденной смежной вершины.
        }
    }
    color[v] = .black // Теперь вершина обработана.
}

func mainDFS(_ V: Int, _ adjList: [[Int]]) {
    color = Array(repeating: .white, count: V) // Инициализируем массив цветов.
    for i in 0..<V { // Перебираем варианты стартовых вершин.
        if color[i] == .white {
            DFS(i, adjList) // Запускаем обход, стартуя с i-й вершины.
        }
    }
}
