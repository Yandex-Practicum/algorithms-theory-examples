// Вызываем функцию поиска пути
const [dist, currentPoint] = escapeFromMaze(n, m, field, start_point);
const path = [];

// Строим путь от текущей точки до стартовой точки
while (!isEqual(currentPoint, start_point)) {
    path.push(currentPoint);
    currentPoint = prev[currentPoint];
}

// Условие выхода из цикла составлено так, что начальная точка не будет добавлена в путь, поправим это.
path.push(start_point);

// Разворачиваем путь, так как первой мы добавляли конечную точку маршрута.
path.reverse();
