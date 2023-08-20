// Функция возвращает новый корень поддерева.
func rotate<T: Comparable>(_ vertex: Node<T>) -> Node<T> {
    if abs(vertex.left.height - vertex.right.height) < 2 {
        // Вращать не надо, поддерево с вершиной vertex и так сбалансировано.
        return vertex
    }
    
    if vertex.left.height - vertex.right.height == -2 {
        // Нам нужны левые вращения.
        let b = vertex.right
        let R = b.right
        let C = b.left
        
        if C.height <= R.height {
            // Нужно малое левое вращение.
            return smallLeftRotation(vertex)
        } else {
            // Нужно большое левое вращение.
            return bigLeftRotation(vertex)
        }
    }
    
    if vertex.left.height - vertex.right.height == 2 {
        // Нам нужны правые вращения.
        let b = vertex.left
        let C = b.right
        let L = b.left
        
        if C.height <= L.height {
            // Нужно малое правое вращение.
            return smallRightRotation(vertex)
        } else {
            // Нужно большое правое вращение.
            return bigRightRotation(vertex)
        }
    }
}
