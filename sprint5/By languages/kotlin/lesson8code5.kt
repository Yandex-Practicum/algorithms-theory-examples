// Функция возвращает новый корень поддерева.
fun rotate(vertex: Vertex): Vertex {
    if (kotlin.math.abs(vertex.left.height - vertex.right.height) < 2) {
        // Вращать не надо, поддерево с вершиной vertex и так сбалансировано.
        return vertex
    } else if (vertex.left.height - vertex.right.height == -2) {
        // Нам нужны левые вращения.
        val b = vertex.right
        val R = b.right
        val C = b.left

        return if (C.height <= R.height) {
            // Нужно малое левое вращение.
            smallLeftRotation(vertex)
        } else {
            // Нужно большое левое вращение.
            bigLeftRotation(vertex)
        }
    } else if (vertex.left.height - vertex.right.height == 2) {
        // Нам нужны правые вращения.
        val b = vertex.left
        val C = b.right
        val L = b.left

        return if (C.height <= L.height) {
            // Нужно малое правое вращение.
            smallRightRotation(vertex)
        } else {
            // Нужно большое правое вращение.
            bigRightRotation(vertex)
        }
    }

    // Этот код никогда не выполняется, т.к. все ветви условий возвращают значение.
    // Но тем не менее, для компилятора этот код нужен.
    return vertex
}
