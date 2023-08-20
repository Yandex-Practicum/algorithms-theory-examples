import Foundation

// Определяем структуру для точки с координатами (x, y)
struct Point {
    var x: Int
    var y: Int
}

// Задаем возможные направления движения
let movements: [Point] = [Point(x: -1, y: 0), Point(x: 1, y: 0), Point(x: 0, y: -1), Point(x: 0, y: 1)]

func escapeFromMaze(n: Int, m: Int, field: [[Int]], startPoint: Point) -> (Int, Point) {
    // Предок вершины (x, y) -- это предыдущая вершина на кратчайшем пути 
    // от стартовой точки до текущей (x, y). 
    // Изначально заполняем любыми невалидными значениями, например, -1.
    var prev = [[Int]](repeating: [Int](repeating: -1, count: m), count: n)

    // Заполняем массив расстояний нейтральными по отношению к минимуму значениями.
    // Значение x нейтральное, если min(x, y) = y для любого допустимого y.
    let INF = n * m + 10
    var dist = [[Int]](repeating: [Int](repeating: INF, count: m), count: n)

    // Начинаем обход в ширину (BFS).
    // Заводим очередь для хранения точек.
    var q = Queue<Point>()

    q.enqueue(startPoint)
    while !q.isEmpty {
        let currentPoint = q.dequeue()!
        for move in movements {
            let newPoint = Point(x: currentPoint.x + move.x, y: currentPoint.y + move.y)
            if isFree(newPoint) && dist[newPoint.x][newPoint.y] == INF {
                q.enqueue(newPoint)
                prev[newPoint.x][newPoint.y] = currentPoint.x * m + currentPoint.y
                dist[newPoint.x][newPoint.y] = dist[currentPoint.x][currentPoint.y] + 1
                if isExit(newPoint) {
                    return (dist[newPoint.x][newPoint.y], newPoint)
                }
            }
        }
    }

    return (INF, Point(x: -1, y: -1))
}

// Добавьте функции isFree() и isExit() для проверки свободных клеток и выхода

// Пример использования
let n: Int = ... // Число строк и столбцов в карте.
let m: Int = ...
let field: [[Int]] = ... // Считываем саму карту.
let startPoint: Point = ... // Найдём стартовую клетку, в которой стоит звёздочка.

let result = escapeFromMaze(n: n, m: m, field: field, startPoint: startPoint)
print("Дистанция до выхода: \(result.0)")
print("Координаты выхода: (\(result.1.x), \(result.1.y))")
