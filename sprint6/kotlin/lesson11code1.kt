// Заведём функцию, которая будет проверять выход за границу поля и наличие
// в клетке препятствия.
fun isFree(point: Pair<Int, Int>): Boolean {
    val (x, y) = point
    return x >= 0 && y >= 0 && x < n && y < m && field[x][y] == 0
}

// Функция проверяет, является ли точка выходом из лабиринта.
fun isExit(point: Pair<Int, Int>): Boolean {
    val (x, y) = point
    return isFree(point) && (x == n - 1 || x == 0 || y == m - 1 || y == 0)
}

// Чтобы не копировать один и тот же код,  
// сделаем массив с векторами возможных перемещений.
val movements = listOf(Pair(0, 1), Pair(0, -1), Pair(1, 0), Pair(-1, 0))

// Сложение нужно для удобного передвижения из точки на вектор передвижения.
// Другой вариант -- определить свой класс для точки и 
// переопределить в нём сложение.
fun add(point1: Pair<Int, Int>, point2: Pair<Int, Int>): Pair<Int, Int> {
    return Pair(point1.first + point2.first, point1.second + point2.second)
}

// Так выглядит обход соседей текущей клетки point=(x, y).
for (move in movements) {
    val newPoint = add(point, move)
    if (isFree(newPoint)) {
        doSomething(newPoint)
    }
}
