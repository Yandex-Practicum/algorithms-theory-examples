// Вызываем функцию поиска пути
val (dist: Int, currentPoint: Pair<Int, Int>) = escapeFromMaze(n, m, field, start_point)
val path = mutableListOf<Pair<Int, Int>>()

// Строим путь от текущей точки до стартовой точки
while (currentPoint != start_point) {
    path.add(currentPoint)
    currentPoint = prev[currentPoint]!!
}

// Условие выхода из цикла составлено так, что начальная точка не будет добавлена в путь, поправим это.
path.add(start_point)

// Разворачиваем путь, так как первой мы добавляли конечную точку маршрута.
path.reverse()
