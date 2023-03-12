fun bigLeftRotation(a: Node): Node {
    // Задаём обозначения.
    val b = a.right
    val c = b!!.left
    val M = c!!.left
    val N = c.right

    // Переусыновляем вершины.
    a.right = M
    b.left = N
    c.left = a
    c.right = b

    // Корректируем высоты.
    a.height -= 2
    b.height -= 1
    c.height += 1

    // Возвращаем новый корень.
    return c
}
