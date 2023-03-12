// Вызываем функцию поиска пути
auto [dist, currentPoint] = escapeFromMaze(n, m, field, start_point);
std::vector<std::pair<int, int>> path;

// Строим путь от текущей точки до стартовой точки
while (currentPoint != start_point) {
    path.push_back(currentPoint);
    currentPoint = prev[currentPoint];
}

// Условие выхода из цикла составлено так, что начальная точка не будет добавлена в путь, поправим это.
path.push_back(start_point);

// Разворачиваем путь, так как первой мы добавляли конечную точку маршрута.
std::reverse(path.begin(), path.end());
