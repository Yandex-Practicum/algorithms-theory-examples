// Вызываем функцию поиска пути
var (dist, currentPoint) = escapeFromMaze(n, m, field, start_point);
List<(int, int)> path = new List<(int, int)>();

// Строим путь от текущей точки до стартовой точки
while (currentPoint != start_point) {
    path.Add(currentPoint);
    currentPoint = prev[currentPoint];
}

// Условие выхода из цикла составлено так, что начальная точка не будет добавлена в путь, поправим это.
path.Add(start_point);

// Разворачиваем путь, так как первой мы добавляли конечную точку маршрута.
path.Reverse();
