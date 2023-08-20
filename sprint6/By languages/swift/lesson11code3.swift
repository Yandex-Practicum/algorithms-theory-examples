// Вызываем функцию поиска пути
let (dist, currentPoint) = escapeFromMaze(n: n, m: m, field: field, startPoint: start_point)
var path = [Point]()

// Строим путь от текущей точки до стартовой точки
var current = currentPoint
while current != start_point {
    path.append(current)
    current = Point(x: prev[current.x][current.y] / m, y: prev[current.x][current.y] % m)
}

// Добавляем начальную точку в путь
path.append(start_point)

// Разворачиваем путь, так как первой мы добавляли конечную точку маршрута.
path.reverse()
