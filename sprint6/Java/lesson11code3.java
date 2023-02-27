// Вызываем функцию поиска пути
var result = escapeFromMaze(n, m, field, start_point);
int dist = result.getFirst();
var currentPoint = result.getSecond();
List<Pair<Integer, Integer>> path = new ArrayList<>();

// Строим путь от текущей точки до стартовой точки
while (!currentPoint.equals(start_point)) {
    path.add(currentPoint);
    currentPoint = prev.get(currentPoint);
}

// Условие выхода из цикла составлено так, что начальная точка не будет добавлена в путь, поправим это.
path.add(start_point);

// Разворачиваем путь, так как первой мы добавляли конечную точку маршрута.
Collections.reverse(path);
