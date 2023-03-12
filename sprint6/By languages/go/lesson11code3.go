// Вызываем функцию поиска пути
dist, currentPoint := escapeFromMaze(n, m, field, start_point)
path := make([]pairInt, 0)

// Строим путь от текущей точки до стартовой точки
for currentPoint != start_point {
    path = append(path, currentPoint)
    currentPoint = prev[currentPoint]
}

// Условие выхода из цикла составлено так, что начальная точка не будет добавлена в путь, поправим это.
path = append(path, start_point)

// Разворачиваем путь, так как первой мы добавляли конечную точку маршрута.
reverseSlice(path)
