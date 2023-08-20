import Foundation

// Определение перечисления для цветов вершин
enum Color {
    case white, gray, black
}

let V = 100  // Количество вершин в графе

var adjList = Array(repeating: [Int](), count: V) // Список смежности для графа
var color = Array(repeating: Color.white, count: V) // Цвета вершин
var previous = Array(repeating: -1, count: V) // Массив предыдущих вершин
var distance = Array(repeating: 0, count: V) // Расстояния от начальной вершины

// Обход в ширину
func BFS(_ s: Int) {
    var planned = Queue<Int>() // Очередь для планирования вершин
    planned.enqueue(s)
    color[s] = .gray
    distance[s] = 0
    while !planned.isEmpty {
        let u = planned.dequeue()!
        for v in adjList[u] {
            if color[v] == .white {
                distance[v] = distance[u] + 1
                previous[v] = u
                color[v] = .gray
                planned.enqueue(v)
            }
        }
        color[u] = .black
    }
}

// Поиск кратчайшего пути до вершины v
func ShortestPath(_ v: Int) -> Stack<Int> {
    var path = Stack<Int>() // Стек для хранения пути
    var currentVertex = v
    while currentVertex != -1 {
        path.push(currentVertex)
        currentVertex = previous[currentVertex]
    }
    return path
}

// Добавьте ребра в adjList

BFS(0)
let path = ShortestPath(4)
while !path.isEmpty {
    print(path.pop()!, terminator: " ")
}
print()
