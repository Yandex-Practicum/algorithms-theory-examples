func bigLeftRotation<T: Comparable>(_ v: Node<T>) -> Node<T> {
    // Правым ребёнком становится новый корень правого поддерева.
    let newRight = smallRightRotation(v.right)
    v.right = newRight
    
    // Возвращаем новый корень поддерева.
    return smallLeftRotation(v)
}
